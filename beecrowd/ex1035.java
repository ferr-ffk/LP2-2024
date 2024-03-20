import java.util.Scanner;

/**
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D
 * for maior do que A, e a soma de C com D for maior que a soma de A e B e se C
 * e D, ambos, forem positivos e se a variável A for par escrever a mensagem
 * "Valores aceitos", senão escrever "Valores nao aceitos".
 */
public class ex1035 {
    private static boolean validarNumeros(int a, int b, int c, int d) {
        boolean bMaiorC = b > c;

        boolean dMaiorA = d > a;

        int somaCD = c + d;
        int somaAB = a + b;
        boolean somaABMaiorCD = somaCD > somaAB;

        boolean positivoCD = c > 0 && d > 0;

        boolean aPar = a % 2 == 0;

        return bMaiorC && dMaiorA && somaABMaiorCD && positivoCD && aPar;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        if(validarNumeros(a, b, c, d)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        
        teclado.close();
    }
}
