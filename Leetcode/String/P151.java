/*
 *  09/26/2017
 *  Problem 151. Reverse Words in a String
 *  Runtime O(1)
 */

public class P151 {
	public class Solution {
	    public String reverseWords(String s) {
	        int index = s.indexOf(' ');
	        return index == -1 ? s : s.substring(0, index - 1).concat(" " + reverseWords(s.substring(index +1)));
	    }
	}
}
