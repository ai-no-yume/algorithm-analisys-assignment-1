import java.util.Scanner;
import java.util.Random;

public class Exercise {
    public static void cubicOperation(int[][][] threeDimensionalArray) {
        int n = threeDimensionalArray.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    threeDimensionalArray[i][j][k]++;
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