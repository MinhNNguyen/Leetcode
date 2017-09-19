/*
 *  09/15/2017
 *  Problem 5
 *  Runtime O(n * log(n))
 *  Start from the left the array, check every possible biggest 
 *  palindrome with the middle of the palindrome being possible at any index of the array
 */
public class P5 {

    public String longestPalindrome(String s) {
        if (s.length() == 0)
            return null;
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findPalindrome(s, i, i);
            int len2 = findPalindrome(s, i, i+ 1);
            if (Math.max(len1, len2) > max) {
                start = (len1 > len2) ? (i - len1 / 2) : (i - len2 / 2 + 1);
                max = Math.max(len1, len2);

            }
        }
        return s.substring(start, start + max);
    }
    
    public int findPalindrome(String s, int low, int high) {
        while ( low >= 0 && high < s.length() && s.charAt(low)  == s.charAt(high)) {
            low--;
            high++;
        }
        return high - low - 1;
    }
    
	

}
