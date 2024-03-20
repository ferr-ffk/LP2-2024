import java.util.Scanner;

public class ex1013 {

    private static int maiorAB(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    private static int maiorABC(int a, int b, int c) {
        return maiorAB(maiorAB(a, b), c);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] valores = teclado.nextLine().split("[\s]");

        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        String resultado = String.format("%d eh o maior", maiorABC(a, b, c));

        System.out.print(resultado);
        System.out.println();

        teclado.close();
    }
}
