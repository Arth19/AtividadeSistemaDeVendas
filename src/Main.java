import java.util.Date;
import View.InterfaceForUser;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        int entrada = 0;

        System.out.println(InterfaceForUser.mostraMenu());
        entrada = s.nextInt();

        InterfaceForUser.tratarEntrada(InterfaceForUser.registraEntrada(entrada));
        InterfaceForUser.selecao(entrada);





    }
}
