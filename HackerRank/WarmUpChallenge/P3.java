// Jumping on the Clouds Solution
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    // Brute force: dynamic programming from 0 to n - 1
    // Starting from 0 as 0, 1 as step of 0 add 1, 2 as min of (total step to 0 plus 1 and total step to 1 plus 1). Keep going like that, any thunderstorm cloud would be n + 1
    // Return the min step to reach n - 1. If there are 3 thunderstorm cloud next to each other, the trip is impossible.
    // Runtime O(n) space: n
    // Improvement: since making a long jump is always better, we can always check the long run first if it is possible to jump there.
    // Runtime: O(n) space: 1
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int pos = c.length - 1;
        while ( pos > 0) {
            pos = (pos - 2) < 0 || c[pos - 2] == 0 ? pos - 2 : pos - 1;
            steps++;
        }
        return steps;
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
