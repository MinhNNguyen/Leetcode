import java.util.HashMap;

/*
 *  09/29/2017
 *  Problem 205. Isomorphic Strings
 *  Runtime O(n)
 *  Use hashmap to iterate through two strings and make sure each character 
 *  in one string can only be replaced by one other character in other string
 */
public class P205 {
	class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        if (s.length() != t.length())
	            return false;
	        char[] s1 = s.toCharArray();
	        char[] s2 = t.toCharArray();
	        int len = s1.length;
	        if (len != s2.length)
	            return false;
	        HashMap<Character, Character> hash = new HashMap<Character, Character>();
	        for (int i = 0; i < len; i++) {
	            if (!hash.containsKey(s1[i])) {
	                if (hash.containsValue(s2[i]))
	                    return false;
	                hash.put(s1[i], s2[i]);
	            }
	            else {
	                if (hash.get(s1[i]) != s2[i]) {
	                    return false;
	                }
	            }    
	        }
	        return true;

	    }
	}
}
