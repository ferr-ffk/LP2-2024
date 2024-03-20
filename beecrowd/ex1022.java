import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1022 {
    enum TipoOperacao {
        SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO;
    }

    private static int[] somaFracoes(int n1, int d1, int n2, int d2) {
        int[] v = {(n1 * d2 + n2 * d1), d1 * d2};

        return v;
    }
    
    private static int[] subtracaoFracoes(int n1, int d1, int n2, int d2) {
        int[] v = {(n1 * d2 - n2 * d1), d1 * d2};
    
        return v;
    }
    
    private static int[] multplicacaoFracoes(int n1, int d1, int n2, int d2) {
        int[] v = {(n1 * n2), d1 * d2};
    
        return v;
    }
    
    private static int[] divisaoFracoes(int n1, int d1, int n2, int d2) {
        int[] v = {(n1 * d2), n2 * d1};
    
        return v;
    }

    private static List<String> lerEntrada(String linha) {
        List<String> caracteres = Arrays.asList(linha.split("[\s]"));

        return caracteres;
    }

    private static TipoOperacao obterTipoOperacao(List<String> entrada) {
        String caracter = entrada.get(3);

        if (caracter.equals("+")) {
            return TipoOperacao.SOMA;
        } else if (caracter.equals("-")) {
            return TipoOperacao.SUBTRACAO;
        } else if (caracter.equals("/")) {
            return TipoOperacao.DIVISAO;
        } else if (caracter.equals("*")) {
            return TipoOperacao.MULTIPLICACAO;
        }

        return null;
    }

    private static int[] obterFracaoDeTresCaracteres(List<String> caracteres) {
        int n1 = Integer.parseInt(caracteres.get(0));
        int d1 = Integer.parseInt(caracteres.get(2));

        int[] v = {n1, d1};

        return v;
    }

    private static String formatarFracaoEmString(int[] fracao) {
        return String.format("%d/%d", fracao[0], fracao[1]);
    }

    public static int[] simplificarFracao(int[] resultado) {
        int[] vetor = {resultado[0], resultado[1]};

        int numerador = vetor[0];
        int denominador = vetor[1];

        for(int fator = 2;;) {
            boolean ambosDivisiveisPeloFator = numerador % fator == 0 && denominador % fator == 0;

            if (ambosDivisiveisPeloFator) {
                numerador /= fator;
                denominador /= fator;

                vetor[0] = numerador;
                vetor[1] = denominador;

                // reinicio do fator
                fator = 2;
                continue;
            }

            if (fator > numerador || fator > denominador) {
                break;
            }

            // o fator só pode mudar aqui por conta do reinicio dele no meio do loop
            fator += 1;
        }

        int[] v = {numerador, denominador};

        return v;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<String> resultados = new ArrayList<>();

        int numeroOperacoes = teclado.nextInt();

        teclado.nextLine();

        for (int i = 0; i < numeroOperacoes; i++) {
            List<String> caracteres = lerEntrada(teclado.nextLine());

            int[] fracao1 = obterFracaoDeTresCaracteres(caracteres.subList(0, 3));
            int[] fracao2 = obterFracaoDeTresCaracteres(caracteres.subList(4, 7));

            TipoOperacao operacao = obterTipoOperacao(caracteres);

            int[] resultado = {};

            switch (operacao) {
                case SOMA:
                    resultado = somaFracoes(fracao1[0], fracao1[1], fracao2[0], fracao2[1]);

                    break;

                case SUBTRACAO:
                    resultado = subtracaoFracoes(fracao1[0], fracao1[1], fracao2[0], fracao2[1]);
                    
                    break;

                case MULTIPLICACAO:
                    resultado = multplicacaoFracoes(fracao1[0], fracao1[1], fracao2[0], fracao2[1]);
                    
                    break;

                case DIVISAO:
                    resultado = divisaoFracoes(fracao1[0], fracao1[1], fracao2[0], fracao2[1]);
                    
                    break;
            
                default:
                    break;

            }

            int[] resultadoAntigo = resultado;

            resultado = simplificarFracao(resultado);

            resultados.add(formatarFracaoEmString(resultadoAntigo) + " = " + formatarFracaoEmString(resultado));
        }

        resultados.forEach(r -> System.out.println(r));

        teclado.close();
    }

}
