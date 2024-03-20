import java.util.Scanner;

public class ex1020 {
    private static String formatDiasParaStrings(int dias) {
        int anos = (int) Math.floor(dias / 365);
        int meses = (int) Math.floor(dias / 30) % 12;
        int diasRestantes = dias - (meses * 30 + anos * 365);

        return String.format("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, diasRestantes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();

        System.out.println(formatDiasParaStrings(dias));

        scanner.close();
    }
}
