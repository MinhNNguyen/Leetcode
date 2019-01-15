// First challenge: Sock Merchant
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Solution to the problem. All 8 test cases passed.
    // Brute force would be to make a Hashmap with key value pair. Traverse the array once to get the key value pair in
    // Traverse all the key value pair and add number of pairs to result
    // Use numArray[101] since ar[i] >= 1 and <= 100
    // Still O(n) but traverse only once
    static int sockMerchant(int n, int[] ar) {
      int result = 0;
      int[] numArray = new int[101];
      for (int pos: ar) {
          if (++numArray[pos] == 2) {
              numArray[pos] = 0;
              result++;
          }
      }
      return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
