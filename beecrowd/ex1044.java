import java.util.Scanner;

public class ex1044 {
    private static boolean saoMultiplos(int a, int b) {
        return a > b ? verificarMultiplo(a, b) : verificarMultiplo(b, a);
    }
    
    private static boolean verificarMultiplo(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        if(saoMultiplos(a, b)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        teclado.close();
    }
}
