import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> numPares = new ArrayList<>();
        List<Integer> numImpares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                numPares.add(valor);
            } else {
                numImpares.add(valor);
            }
        }

        Collections.sort(numPares);
        Collections.sort(numImpares, Collections.reverseOrder());

        for (int par : numPares) {
            System.out.println(par);
        }

        for (int impar : numImpares) {
            System.out.println(impar);
        }
    }
}
