import java.util.Scanner;
import java.util.Random;

public class Exercise {
    // O(n^3)
    public static void cubicOperation(int[][][] threeDimensionalArray) { // O(1)
        int n = threeDimensionalArray.length; // O(1)

        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                for (int k = 0; k < n; k++) { // O(n)
                    threeDimensionalArray[i][j][k]++; // O(1)
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter dimension size (n): ");
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        }

        int[][][] threeDimensionalArray = new int[n][n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    threeDimensionalArray[i][j][k] = random.nextInt(n);
                }
            }
        }

        long startTime = System.nanoTime();

        cubicOperation(threeDimensionalArray);

        long endTime = System.nanoTime();

        double runtimeNS = endTime - startTime;
        double runtimeS = runtimeNS / 1000000000.0;

        System.out.println("Runtime in ns: " + runtimeNS);
        System.out.println("Runtime in s: " + runtimeS);
    }
}