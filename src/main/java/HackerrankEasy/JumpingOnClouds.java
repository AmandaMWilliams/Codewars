package HackerrankEasy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int minimumNumOfJumps = 0;
        for (int i = 0; i < c.length; i++) {
            while (i <= c.length - 2) {
                if (c[i + 2] == 0) {
                    minimumNumOfJumps++;
                    i += 2;
                } else {
                    minimumNumOfJumps++;
                    i += 1;
                }
            }
        }
        return minimumNumOfJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
