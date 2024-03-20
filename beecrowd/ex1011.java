import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double raio = teclado.nextDouble();

        final double PI = 3.14159;

        double volume = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
        
        teclado.close();
    }
}
