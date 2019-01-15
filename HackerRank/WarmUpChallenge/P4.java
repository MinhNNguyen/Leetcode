// Repeated String
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    // Brute force: Find out how many occurence of a in strings. Find out how many occurence of s
    // in n. Then find out how many occurence of a in the last repeating string of s in n. 
    // Add that number to the multiply of number of s in n and number of a in s.
    // Runtime: O(n) 2 traverses Space: O(1)
    // Improvement: Traverse only once and find out where the last repeated string stop and
    // assigning the count value of that point to that variable
    static long repeatedString(String s, long n) {
        long factor = n / s.length();
        long rem = n % s.length();
        long count = 0, lastStringCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'a') {
                count++;
            }
            if ( rem > 0 && i == rem - 1) {
                lastStringCount = count;
            }
        }
        return ( count * factor ) + lastStringCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
