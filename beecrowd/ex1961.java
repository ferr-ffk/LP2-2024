import java.util.Scanner;

public class ex1961 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alturaPuloSapo = scanner.nextInt();
        int numeroCanos = scanner.nextInt();

        int[] canos = new int[numeroCanos];
        
        for (int i = 0; i < numeroCanos; i++) {
            canos[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeroCanos - 1; i++) {
            int diferencaAltura = Math.abs(canos[i] - canos[i+1]);

            if (diferencaAltura > alturaPuloSapo) {
                System.out.println("GAME OVER");

                scanner.close();
                return;
            }
        }

        System.out.println("YOU WIN");

        scanner.close();
    }
}
