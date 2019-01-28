import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    // Brute force: to traverse from beginning to end. Whenever the next character is the same
    // as the previous one, remove it.
    // Improvement: search for next index of A. If it is the next index ignore, otherwise, it means minus all gap minus 1
    static int alternatingCharacters(String s) {
        int count = 0;
        char cur = 'C';
        for (char next: s.toCharArray()) {
            if (next == cur)
                count++;
            else
                cur = next;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
