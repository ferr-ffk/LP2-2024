import java.util.Scanner;

public class ex1007 {

    private static int calcularDiferenca(int a, int b, int c, int d) {
        return (a * b) - (c * d);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        System.out.printf("DIFERENCA = %d\n", calcularDiferenca(a, b, c, d));
        
        teclado.close();
    }
}
