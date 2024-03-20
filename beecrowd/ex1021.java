import java.util.Scanner;

public class ex1021 {
    private static String formatReaisEmString(float reais) {
        int notasUm  = (int) reais % 10;
        int notasDez = (int) reais % 100;
        int notasCem = (int) (reais % 1000 - notasDez) / 100;

        System.out.println("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", notasCem);
        System.out.printf("%d nota(s) de R$ 10.00\n", notasDez);
        System.out.printf("%d nota(s) de R$ 1.00\n", notasUm);

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float dias = scanner.nextFloat();

        System.out.println(formatReaisEmString(dias));

        scanner.close();
    }
}
