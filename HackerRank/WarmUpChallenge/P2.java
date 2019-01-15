// Counting Valley problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    // Brute force: having a variable level keep track if Gary is above or below sea level
    // Having another boolean variable to keep track if Gary in in valley
    // Every step up or down, check if Gary has entered or exited the valley, if it is the latter
    // increment result by 1
    // Run time: O(n) Space
    // Improvement: We only care about how many times we came back to the surface. So we can
    // just remove the inValley variable and only increment the result when Gary steps up and
    // level is at 0 
    //
    static int countingValleys(int n, String s) {
        int result = 0;
        int level = 0;
        char[] charArray = s.toCharArray();
        for (char cur: charArray) {
            if (cur == 'U') {
                ++level;
                result = level == 0 ? ++result : result;
            }
            else {
                --level;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
