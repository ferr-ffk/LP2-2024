import java.util.Scanner;

public class ex1006 {
    static final int PESO_NOTA_A = 2;
    static final int PESO_NOTA_B = 3;
    static final int PESO_NOTA_C = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double notaA = teclado.nextDouble();
        double notaB = teclado.nextDouble();
        double notaC = teclado.nextDouble();

        double media = ((notaA * PESO_NOTA_A) + (notaB * PESO_NOTA_B) + (notaC * PESO_NOTA_C)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
        
        teclado.close();
    }
}
