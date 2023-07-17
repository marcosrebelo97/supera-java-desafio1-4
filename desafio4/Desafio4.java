import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String original = decipherLine(line);
            System.out.println(original);
        }
    }

    private static String decipherLine(String line) {
        int length = line.length();
        int mid = length / 2;

        StringBuilder sb = new StringBuilder();

        for (int i = mid - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        for (int i = length - 1; i >= mid; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}
