import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Brute force: we can traverse both strings and count occurence of all characters. Compare the // difference and add up the result. 
// Improvement: going through the first string. Remember the occurence and then go through the second string, every time each character appear, decrement the same char occurence. At the end, go through the difference and add up the sum.
// Space O(n). Space: n

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count = 0;
        int[] charCounts = new int[26];
        for (char c: a.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (char c: b.toCharArray()) {
            charCounts[c - 'a']--;
        }
        for (int num: charCounts) {
            count += Math.abs(num);
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
