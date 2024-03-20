import java.util.Scanner;

public class ex1019 {
    private static String formatarSegundosParaString(int segundos) {
        int horas = (int) Math.floor(segundos / 3600);
        int minutos = (int) Math.floor(segundos / 60) % 60;
        int segundosRestantes = segundos - ((int) (Math.floor(segundos / 60)) * 60);

        return String.format("%d:%d:%d", horas, minutos, segundosRestantes);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int segundos = teclado.nextInt();

        System.out.print(formatarSegundosParaString(segundos));
        System.out.println();

        teclado.close();
    }
}
