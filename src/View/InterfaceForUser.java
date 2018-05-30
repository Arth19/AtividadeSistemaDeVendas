package View;
import Controller.ClienteController;
import Model.Cliente;

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
    public static void opcaoUm(int input){
        Scanner s = new Scanner(System.in);
        if(input==1){
            System.out.println( "#########################################\n" +
                                "          CADASTRANDO CLIENTE            \n" +
                                "#########################################\n");
            System.out.println("Nome: ");
            String nome = s.nextLine();
            s.close();
            System.out.println("\nE-mail: ");
            String email = s.nextLine();
            s.close();

            System.out.println("\nData de nascimento: ");
            int dia = s.nextInt();
            s.close();
            System.out.println("/");
            int mes = s.nextInt();
            s.close();
            System.out.println("/");
            int ano = s.nextInt();
            s.close();
            Date data = tratarDatas(ano, mes, dia);

            System.out.println("\nAgora cadastraremos uma senha.\n");
            System.out.println("Insira uma senha: ");
            String senha = s.nextLine();
            s.close();
            Cliente c = new Cliente(nome,email, senha, data);
            if(ClienteController.cadastrarCliente(c)==true){
                System.out.println("Pronto, o cliente " + c.getNome() + " foi cadastrado com sucesso! ");
            }else{
                System.out.println("Erro ao cadastrar o cliente.");
            }

        }else if (input == 2){

            System.out.println( "#########################################\n" +
                                "          CLIENTES CADASTRADOS           \n" +
                                "#########################################\n");
            Set<Cliente> clientes = ClienteController.listaCliente();
            for(Cliente c: clientes){
                System.out.println("#######################################");
                c.toString();
            }
        }else if (input == 3){
            System.out.println( "#########################################\n" +
                                "          CADASTRANDO VENDEDOR           \n" +
                                "#########################################\n");
        }else if (input == 4){

        }else if (input == 5){

        }else if (input == 6){

        }else if (input == 7){

        }else if (input == 8){

        }else if (input == 9){

        }else {

        }
    }

}
