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
import java.util.Set;

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
    public static int registraEntrada(int input){
        int n = 0;

        if(input > 9 || input < 1){
            return n;
        }else{
            n = input;
            return n;
        }
    }
    public static String tratarEntrada(int input){

        if(input==0){
            return"\nVocê digitou um número inválido, por favor insira um valor valor correspondente a sua solicitação: ";
        }else{
            return "\nOk, vamos continuar.";
        }
    }
    public static Date tratarDatas(int ano, int mes, int dia){
        Scanner s = new Scanner(System.in);
        do {
            dia = s.nextInt();
            s.close();
        }while(dia>31 || dia<1);
        System.out.println("/");
        do {
            mes = s.nextInt();
            s.close();
        }while(mes>12 || mes<1);
        System.out.println("/");
        do{
            ano = s.nextInt();
            s.close();
        }while(ano>2018);

        Date data = new Date(ano, mes, dia);
        return data;
    }
    public static void selecao(int input){
        Scanner s = new Scanner(System.in);
        if(input==1){
//CADASTRAR CLIENTES
            System.out.println( "#########################################\n" +
                                "          CADASTRANDO CLIENTE            \n" +
                                "#########################################\n");
            System.out.print("Nome: ");
            String nome = s.nextLine();
            s.close();
            System.out.print("\nE-mail: ");
            String email = s.nextLine();
            s.close();

            System.out.print("\nData de nascimento: ");
            int dia = s.nextInt();
            s.close();
            System.out.print("/");
            int mes = s.nextInt();
            s.close();
            System.out.print("/");
            int ano = s.nextInt();
            s.close();
            Date data = tratarDatas(ano, mes, dia);

            System.out.println("\nAgora cadastraremos uma senha.\n");
            System.out.println("Insira uma senha: ");
            String senha = s.nextLine();
            s.close();
            Cliente c = new Cliente(nome,email, senha, data);
            if(ClienteController.cadastrarCliente(c)==true){
                ClienteController.cadastrarCliente(c);
                System.out.println("Pronto, o cliente " + c.getNome() + " foi cadastrado com sucesso! ");
            }else{
                System.out.println("Erro ao cadastrar o cliente.");
            }

        }else if (input == 2){
//LISTA DE CLIENTES CADASTRADOS
            System.out.println( "#########################################\n" +
                                "          CLIENTES CADASTRADOS           \n" +
                                "#########################################\n");
            Set<Cliente> clientes = ClienteController.listaCliente();
            for(Cliente c: clientes){
                System.out.println("#######################################");
                System.out.println(c.toString());
            }
        }else if (input == 3){
//CADASTRAR VENDEDOR
            System.out.println( "#########################################\n" +
                                "          CADASTRANDO VENDEDOR           \n" +
                                "#########################################\n");
            System.out.print("Nome: ");
            String nomeV = s.nextLine();
            s.close();
            System.out.print("\nE-mail: ");
            String emailV = s.nextLine();
            s.close();

            System.out.print("\nData de nascimento: ");
            int diaV = s.nextInt();
            s.close();
            System.out.print("/");
            int mesV = s.nextInt();
            s.close();
            System.out.print("/");
            int anoV = s.nextInt();
            s.close();
            Date dataV = tratarDatas(anoV, mesV, diaV);

            System.out.print("\nData de contratação: ");
            int diaContrato = s.nextInt();
            s.close();
            System.out.print("/");
            int mesContrato = s.nextInt();
            s.close();
            System.out.print("/");
            int anoContrato = s.nextInt();
            s.close();
            Date dataContrato = tratarDatas(anoContrato, mesContrato, diaContrato);

            System.out.println("\nAgora cadastraremos uma senha.\n");
            System.out.println("Insira uma senha: ");
            String senhaVendedor = s.nextLine();
            s.close();
            System.out.print("\n");

            Vendedor v = new Vendedor(nomeV, emailV,senhaVendedor, dataV, dataContrato);
            if(VendedorController.cadastraVendedor(v)==true){
                VendedorController.cadastraVendedor(v);
                System.out.println("\n\n Pronto, o vendedor " +v.getNome()+" foi cadastrado com sucesso.");
            }else{
                System.out.println("Houve um erro ao cadastrarmos o vendedor.");
            }

        }else if (input == 4){
//LISTA DE VENDEDORES CADASTRADOS
            System.out.println( "#########################################\n" +
                                "         VENDEDORES CADASTRADOS          \n" +
                                "#########################################\n");
            Set<Vendedor> vendedores = VendedorController.listaVendedores();
            for(Vendedor v: vendedores){
                System.out.println("##########################################");
                System.out.println(v.toString());
            }
        }else if (input == 5){
//CADASTRAR PRODUTOS
            System.out.println( "#########################################\n" +
                                "          CADASTRANDO PRODUTOS           \n" +
                                "#########################################\n");
            System.out.print("Nome do produto: ");
            String nomeP = s.nextLine();
            s.close();
            System.out.print("\nPreço do produto: R$");
            double preco = s.nextDouble();
            s.close();
            System.out.print("\nPeso do produto: Kg");
            double peso = s.nextDouble();
            s.close();
            System.out.print("\n");
            Produto p = new Produto(nomeP,preco,peso);
            if(ProdutoController.cadastrarProduto(p)){
                ProdutoController.cadastrarProduto(p);
                System.out.println("Produto, produto adicionado com sucesso!");
            } else{
                System.out.println("Erro ao adicionar produto.");
            }

        }else if (input == 6){
//LISTA DE PRODUTOS
            System.out.println( "#########################################\n" +
                                "            PRODUTOS LISTADOS            \n" +
                                "#########################################\n");
            Set<Produto> produtos = ProdutoController.listarProdutos();
            for(Produto p: produtos){
                System.out.println("###########################################");
                System.out.println(p.toString());
            }

        }else if (input == 7){
//REGISTRAR VENDAS
            System.out.println( "#########################################\n" +
                                "             REGISTRAR VENDA             \n" +
                                "#########################################\n");

            System.out.print("Data da venda: ");
            int diaVenda = s.nextInt();
            s.close();
            System.out.print("/");
            int mesVenda = s.nextInt();
            s.close();
            System.out.print("/");
            int anoVenda = s.nextInt();
            s.close();
            System.out.print("\nE-mail do vendedor responsável: ");
            String emailVend = s.nextLine();
            s.close();
            System.out.print("\nProduto: ");
            String nomeProd = s.nextLine();
            s.close();
            System.out.print("\nE-mail do cliente: ");
            String emailClient = s.nextLine();
            s.close();
            System.out.println("\n Quantidade: ");
            int qtdVenda = s.nextInt();
            s.close();

            Cliente c = ClienteController.buscaCliente(emailClient);
            Produto p = ProdutoController.buscaProduto(nomeProd);
            Vendedor v = VendedorController.buscaVendedor(emailVend);

            Date dataVenda = tratarDatas(anoVenda, mesVenda, diaVenda);

            Venda venda = new Venda(dataVenda,p,qtdVenda,c,v);
        }else if (input == 8){
//RELATÓRIO DE VENDAS
            System.out.println( "#########################################\n" +
                                "          RELATÓRIO DE VENDAS            \n" +
                                "#########################################\n");
            Set<Venda> vendas = VendaController.relatorioVendas();
            for (Venda v: vendas){
                System.out.println("######################################");
                System.out.println(v.toString());
            }
        }else if (input == 9){
            System.out.println("Vai sair? :(" + "\nTudo bem, espero poder ajudar depois. ;)" + "\nAté logo!");

        }else {

        }
    }

}
