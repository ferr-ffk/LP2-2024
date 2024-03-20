import java.util.Scanner;

public class ex2923 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamanhoTotal = teclado.nextInt();

        int armazenamentoUtilizado = teclado.nextInt();

        int porcentagemWarning = teclado.nextInt();

        int porcentagemCritica = teclado.nextInt();


        int porcentagemUtilizado = (100 * armazenamentoUtilizado) / tamanhoTotal;

        if (porcentagemUtilizado >= porcentagemCritica) {
            System.out.println("critical");
        } else if (porcentagemUtilizado >= porcentagemWarning) {
            System.out.println("warning");
        } else {
            System.out.println("OK");
        }
        
        teclado.close();
    }
}
