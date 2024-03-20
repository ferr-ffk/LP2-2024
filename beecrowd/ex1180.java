import java.util.Scanner;

/**
 * ex1180
 */
public class ex1180 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }

        int menorValor = X[0];
        int posicaoMenorValor = 0;
        for (int i = 1; i < N; i++) {
            if (X[i] < menorValor) {
                menorValor = X[i];
                posicaoMenorValor = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);

        scanner.close();
    }
}