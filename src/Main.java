import java.util.Date;
import View.InterfaceForUser;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Date data = new Date("05/08/1997");
//      System.out.println(data.toString());
        Scanner s = new Scanner(System.in);
        int entrada = 0;

        System.out.println(InterfaceForUser.mostraMenu());
        entrada = s.nextInt();
        s.close();
        InterfaceForUser.tratarEntrada(InterfaceForUser.registraEntrada(entrada));

    }
}
