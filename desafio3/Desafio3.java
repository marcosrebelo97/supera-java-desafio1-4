import java.util.HashMap;

public class Desafio3 {
    public static int paresComDiferenca(int[] arr, int k) {
        HashMap<Integer, Integer> frequenciaMap = new HashMap<>();

        for (int num : arr) {
            frequenciaMap.put(num, frequenciaMap.getOrDefault(num, 0) + 1);
        }

        int countPares = 0;

        for (int num : arr) {
            int target1 = num + k;
            int target2 = num - k;

            if (frequenciaMap.containsChave(target1)) {
                countPares += frequenciaMap.get(target1);
            }
            if (k != 0 && frequenciaMap.containsChave(target2)) {
                countPares += frequenciaMap.get(target2);
            }
        }

        return countPares / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 1;

        int result = paresComDiferenca(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + result);
    }
}