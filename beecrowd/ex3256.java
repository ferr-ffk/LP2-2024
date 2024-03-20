import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ex3256 {
    private static boolean percorreuListaInteira;
    private static boolean formacaoPossuiInimigoDeIndiceI;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroSoldados = teclado.nextInt();

        int numeroInimizades = teclado.nextInt();

        // para burlar o hashmap em java (já que as chaves só podem ser unicas), cada
        // chave referencia uma lista de todos os inimigos que aquele soldado tem
        Map<Integer, List<Integer>> relacaoSoldadosInimigos = new HashMap<>(numeroSoldados);

        for (int i = 0; i < numeroInimizades; i++) {
            int soldadoA = teclado.nextInt();
            int soldadoB = teclado.nextInt();

            // se o soldado já foi registrado como tendo inimigo antes, apenas adiciona um
            // novo inimigo, se não, inicializa a lista
            if (!relacaoSoldadosInimigos.containsKey(soldadoA)) {
                relacaoSoldadosInimigos.put(soldadoA, new ArrayList<>());
                relacaoSoldadosInimigos.get(soldadoA).add(soldadoB);
            } else {
                relacaoSoldadosInimigos.get(soldadoA).add(soldadoB);
            }

            // faz o mesmo com o soldadoB
            if (!relacaoSoldadosInimigos.containsKey(soldadoB)) {
                relacaoSoldadosInimigos.put(soldadoB, new ArrayList<>());
                relacaoSoldadosInimigos.get(soldadoB).add(soldadoA);
            } else {
                relacaoSoldadosInimigos.get(soldadoB).add(soldadoA);
            }
        }

        List<List<Integer>> grupoSoldadosSeparados = new ArrayList<>(numeroSoldados);

        List<List<Integer>> novaFormacao = new ArrayList<>(10);

        novaFormacao.add(new ArrayList<>());
        novaFormacao.add(new ArrayList<>());
        novaFormacao.add(new ArrayList<>());
        novaFormacao.add(new ArrayList<>());

        for (int i = 0; i < relacaoSoldadosInimigos.size(); i++) {
            // obtem-se o i-esimo key do map
            Integer soldado = (Integer) relacaoSoldadosInimigos.keySet().toArray()[i];
            List<Integer> listaInimigos = relacaoSoldadosInimigos.get(soldado);
            
            // if (novaFormacao.isEmpty()) {
            //     novaFormacao.add(new ArrayList<>());
            // }
    
            boolean contemAlgumInimigo = contemAlgumInimigo(novaFormacao, listaInimigos);
    
            if (!contemAlgumInimigo) {
                novaFormacao.get(i).add(soldado);
            }
            
            System.out.println(novaFormacao.get(i));
        }
        

        teclado.close();
    }

    private static boolean contemAlgumInimigo(List<List<Integer>> novaFormacao, List<Integer> listaInimigos) {
        boolean contemAlgumInimigo = false;

        for (int i = 0; i < novaFormacao.size(); i++) {
            percorreuListaInteira = i > listaInimigos.size() - 1;

            if (percorreuListaInteira) {
                break;
            }

            // System.out.println("novaFormacao.get(i) " + novaFormacao.get(i));
            // System.out.println("listaInimigos.get(i) " + listaInimigos.get(i));

            formacaoPossuiInimigoDeIndiceI = novaFormacao.get(i).contains(listaInimigos.get(i));
            
            if (formacaoPossuiInimigoDeIndiceI) {
                contemAlgumInimigo = true;

                break;
            }
        }


        return contemAlgumInimigo;
    }
}
