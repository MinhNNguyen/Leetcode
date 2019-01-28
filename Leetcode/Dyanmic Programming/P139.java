/*
 * @author Minh Nguyen
 * 139. Word Break
 * 10/10/2017
 * Using Dynamic programming to look for each substring that would be contained in the set and use that
 * to continue looking for longer substring to be covered
 * Runtime: O(n * n) Space O(n)
 */
import java.util.List;

public class P139 {
	class Solution {
	    public boolean wordBreak(String s, List<String> wordDict) {
	        int len = s.length();
	        boolean[] result = new boolean[len + 1];
	        result[0] = true;
	        
	        for (int i = 1; i <= len; i++) {
	            for (int j = 0; j < i; j++) {
	                if (result[j] && wordDict.contains(s.substring(j, i))) {
	                    result[i] = true;
	                    break;
	                }
	            }
	        }
	        return result[len];
	    }
	}
}
