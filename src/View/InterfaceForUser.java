package View;
import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendaController;
import Controller.VendedorController;
import Model.Cliente;
import Model.Produto;
import Model.Venda;
import Model.Vendedor;

import java.util.Date;
import java.util.Scanner;
import java.lang.*;
import java.util.List;

public abstract class InterfaceForUser {
    public static String mostraMenu(){
        String r;

        r = "#################################### \n" +
            "           Sistema de Vendas         \n" +
            "#################################### \n" +
            "1. Cadastrar Clientes \n2. Listar Clientes \n3. Cadastrar Vendedor \n4. Listar Vendedor \n" +
            "5. Cadastrar Produtos \n6. Listar Produtos \n7. Registrar Vendas \n8. Relatório de Vendas \n9. Sair";

        return r;
    }
    public static int registrarEntrada(int input){
        int n = 0;

        if(input > 9 || input < 1){
            return n;
        }else{
            n = input;
            return n;
        }
    }
    public static int tratarEntrada(int input){
        Scanner s = new Scanner(System.in);
        if(input==0){

            System.out.println("\nVocê digitou um número inválido, por favor insira um valor valor correspondente a sua solicitação: ");
            do{
                input = s.nextInt();
            }while (input>9||input<1);
        }else{
            System.out.println("\nOk, vamos continuar.");
        }
        return input;
    }
    public static Date tratarDatas(int ano, int mes, int dia){
        Scanner s = new Scanner(System.in);
        do {
            dia = s.nextInt();
        }while(dia>31 || dia<1);
        System.out.print("/");
        do {
            mes = s.nextInt();
        }while(mes>12 || mes<1);
        System.out.print("/");
        do{
            ano = s.nextInt();
        }while(ano>2018|| ano<0);
        mes = mes-1;
        Date data = new Date(ano, mes, dia);
        return data;
    }
    public static void selecao(){
        Scanner read = new Scanner(System.in);
        int input = 0;
        do {
      //      for(int i=0; i<5; i++){
        //        System.out.println("");
          //  }
            int entrada = 0;
            System.out.println(InterfaceForUser.mostraMenu());
            entrada = read.nextInt();
            input = InterfaceForUser.tratarEntrada(InterfaceForUser.registrarEntrada(entrada));

            if (input == 1) {
                //CADASTRAR CLIENTES
                Scanner s = new Scanner(System.in);

                System.out.println("#########################################\n" +
                        "          CADASTRANDO CLIENTE            \n" +
                        "#########################################\n");
                System.out.print("Nome: ");
                String nome = s.next();
                s.nextLine();
                System.out.print("\nE-mail: ");
                String email = s.nextLine();
                s.nextLine();
                System.out.print("\nData de nascimento: ");
                int ano = -1, mes = 0, dia = 0;
                Date data = tratarDatas(ano, mes, dia);

                System.out.println("\nAgora cadastraremos uma senha.\n");
                System.out.println("Insira uma senha: ");
                String senha = s.nextLine();
                s.nextLine();
                Cliente c = new Cliente(nome, email, senha, data);

                if (ClienteController.cadastrarCliente(c) == true) {
                    ClienteController.cadastrarCliente(c);
                    System.out.println("Pronto, o cliente " + c.getNome() + " foi cadastrado com sucesso! ");
                } else {
                    System.out.println("Erro ao cadastrar o cliente.");
                }

            } else if (input == 2) {
                //LISTA DE CLIENTES CADASTRADOS

                System.out.println("#########################################\n" +
                        "          CLIENTES CADASTRADOS           \n" +
                        "#########################################\n");
                List<Cliente> clientes = ClienteController.listaCliente();
                for (Cliente c : clientes) {
                    System.out.println("#######################################");
                    System.out.println(c.toString());
                }
            } else if (input == 3) {
                //CADASTRAR VENDEDOR
                Scanner s = new Scanner(System.in);

                System.out.println("#########################################\n" +
                        "          CADASTRANDO VENDEDOR           \n" +
                        "#########################################\n");
                System.out.print("Nome: ");
                String nomeV = s.nextLine();
                s.nextLine();
                System.out.print("E-mail: ");
                String emailV = s.nextLine();
                s.nextLine();
                System.out.print("\nData de nascimento: ");
                int diaV = 0, mesV = 0, anoV = 0;
                Date dataV = tratarDatas(anoV, mesV, diaV);

                System.out.print("\nData de contratação: ");
                int diaContrato = 0, mesContrato = 0, anoContrato = -1;
                Date dataContrato = tratarDatas(anoContrato, mesContrato, diaContrato);

                System.out.println("\nAgora cadastraremos uma senha.\n");
                System.out.println("Insira uma senha: ");
                String senhaVendedor = s.nextLine();
                s.nextLine();
                System.out.print("\n");

                Vendedor v = new Vendedor(nomeV, emailV, senhaVendedor, dataV, dataContrato);
                if (v.equals(null) == false) {
                    VendedorController.cadastraVendedor(v);
                    System.out.println("\n\n Pronto, o vendedor " + v.getNome() + " foi cadastrado com sucesso.");
                } else {
                    System.out.println("Houve um erro ao cadastrarmos o vendedor.");
                }

            } else if (input == 4) {
                //LISTA DE VENDEDORES CADASTRADOS

                System.out.println("#########################################\n" +
                        "         VENDEDORES CADASTRADOS          \n" +
                        "#########################################\n");
                List<Vendedor> vendedores = VendedorController.listaVendedores();
                for (Vendedor v : vendedores) {
                    System.out.println("##########################################");
                    System.out.println(v.toString());
                }
            } else if (input == 5) {
                //CADASTRAR PRODUTOS
                Scanner s = new Scanner(System.in);

                System.out.println("#########################################\n" +
                        "          CADASTRANDO PRODUTOS           \n" +
                        "#########################################\n");
                System.out.print("Nome do produto: ");
                String nomeP = s.nextLine();
                s.nextLine();
                System.out.print("\nPreço do produto: R$");
                double preco = s.nextDouble();
                s.nextLine();
                System.out.print("\nPeso do produto: Kg");
                double peso = s.nextDouble();
                s.nextLine();
                System.out.print("\n");

                Produto p = new Produto(nomeP, preco, peso);
                if (ProdutoController.cadastrarProduto(p)) {
                    ProdutoController.cadastrarProduto(p);
                    System.out.println("Produto, produto adicionado com sucesso!");
                } else {
                    System.out.println("Erro ao adicionar produto.");
                }

            } else if (input == 6) {
                //LISTA DE PRODUTOS

                System.out.println("#########################################\n" +
                        "            PRODUTOS LISTADOS            \n" +
                        "#########################################\n");
                List<Produto> produtos = ProdutoController.listarProdutos();
                for (Produto p : produtos) {
                    System.out.println("###########################################");
                    System.out.println(p.toString());
                }

            } else if (input == 7) {
                //REGISTRAR VENDAS
                Scanner s = new Scanner(System.in);

                System.out.println("#########################################\n" +
                        "             REGISTRAR VENDA             \n" +
                        "#########################################\n");

                System.out.print("Data da venda: ");
                int diaVenda = 0, mesVenda = 0, anoVenda = -1;
                System.out.print("\nE-mail do vendedor responsável: ");
                String emailVend = s.nextLine();
                System.out.print("\nProduto: ");
                String nomeProd = s.nextLine();
                System.out.print("\nE-mail do cliente: ");
                String emailClient = s.nextLine();
                System.out.println("\n Quantidade: ");
                int qtdVenda = s.nextInt();

                Cliente c = ClienteController.buscaCliente(emailClient);
                Produto p = ProdutoController.buscaProduto(nomeProd);
                Vendedor v = VendedorController.buscaVendedor(emailVend);

                Date dataVenda = tratarDatas(anoVenda, mesVenda, diaVenda);

                Venda venda = new Venda(dataVenda, p, qtdVenda, c, v);
            } else if (input == 8) {
                //RELATÓRIO DE VENDAS

                System.out.println("#########################################\n" +
                        "          RELATÓRIO DE VENDAS            \n" +
                        "#########################################\n");
                List<Venda> vendas = VendaController.relatorioVendas();
                for (Venda v : vendas) {
                    System.out.println("######################################");
                    System.out.println(v.toString());
                }
            } else if (input == 9) {
                System.out.println("Vai sair? :(" + "\nTudo bem, espero poder ajudar depois. ;)" + "\nAté logo!");

            } else {

            }
        }while(input!=9);
    }

}
