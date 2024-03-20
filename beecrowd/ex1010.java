import java.util.Scanner;

/**
 * ex1010
 */
public class ex1010 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String linha = teclado.nextLine();

        String[] valores = linha.split("[\s]");

        int codigoPeca = Integer.parseInt(valores[0]);

        int numeroPecas = Integer.parseInt(valores[1]);

        double valorPeca = Double.parseDouble(valores[2].replace(',', '.'));

        double valorTotal = valorPeca * numeroPecas;
    
        linha = teclado.nextLine();

        valores = linha.split("[\s]");

        codigoPeca = Integer.parseInt(valores[0]);

        numeroPecas = Integer.parseInt(valores[1]);

        valorPeca = Double.parseDouble(valores[2].replace(',', '.'));

        valorTotal += (valorPeca * numeroPecas);

        String resultado = String.format("VALOR A PAGAR: R$ %.2f", valorTotal);
        System.out.print(resultado);

        teclado.close();
    }
}