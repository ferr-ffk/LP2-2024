public class Testeex1022 {
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

                fator = 2;
                continue;
            }

            if (fator > numerador || fator > denominador) {
                break;
            }

            fator += 1;
        }

        int[] v = {vetor[0], vetor[1]};

        return v;
    }

    public static void main(String[] args) {
        int[] v = {244, 28};

        int[] simplificarFracao = simplificarFracao(v);

        System.out.println(simplificarFracao[0] + " " + simplificarFracao[1]);
    }
}
