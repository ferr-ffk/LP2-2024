import java.util.Scanner;

public class ex1017 {
    static final int KILOMETROS_LITRO = 12;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas = teclado.nextInt();

        int velocidade = teclado.nextInt();

        double distancia = horas * velocidade;

        double gasolina_litros = distancia / KILOMETROS_LITRO;

        System.out.printf("%.3f\n", gasolina_litros);

        teclado.close();
    }
}
