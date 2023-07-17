import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valor = scanner.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        int[] notasMoedas = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        for (int nota : notasMoedas) {
            int quantidadeNotas = centavos / nota;
            centavos %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int nota : notasMoedas) {
            if (nota >= 100) {
                continue;
            }
            int quantidadeMoedas = centavos / nota;
            centavos %= nota;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, nota / 100.0);
        }
    }
}