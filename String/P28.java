/*
 *  09/16/2017
 *  Problem 28
 *  Runtime O(n * m)
 *  Iterate from the start of the array until the last index that could possibly fit the who length of needle
 *   string within the length of the array. For each of those iterate, check if the substring from that index
 *   in the haystack matches with the whole string of needle, if yes, return the first index  
 */
public class P28 {
	class Solution {
	    public int strStr(String haystack, String needle) {
	        if ( needle.length() == 0)
	            return 0;
	        char[] str1 = haystack.toCharArray();
	        char[] str2 = needle.toCharArray();
	        for (int i = 0; i <= str1.length - str2.length; i++) {
	            for (int j = 0; j < str2.length; j++) {
	                if ( str1[i+j] != str2[j]) break;
	                if (j == str2.length - 1) return i;
	            }
	        }
	        return -1;
	    }
	}
}
