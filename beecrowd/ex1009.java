import java.util.Scanner;

public class ex1009 {
    private static final double COMISSAO = 0.15f;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        teclado.nextLine();

        double salario = teclado.nextDouble();

        double vendas = teclado.nextDouble();

        double salarioFinal = salario + (COMISSAO * vendas);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
        
        teclado.close();
    }
}
