import java.util.Scanner;

public class ex1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();

        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);
        
        teclado.close();
    }
}
