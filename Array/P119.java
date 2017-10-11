// 10/10/2017
// 119. Pascal's Triangle II
// Runtime of solution: O(k * k) - Space: O(k)
import java.awt.List;
import java.util.ArrayList;


public class P119 {
	class Solution {
	    public List<Integer> getRow(int rowIndex) {
	        List<Integer> result = new ArrayList<Integer>();
	        if (rowIndex < 0)
	            return result;

	        for (int i = 0; i <= rowIndex; i++) {
	            result.add(0, 1);
	            for (int j = 1; j < result.size() - 1; j++)
	                result.set(j, result.get(j) + result.get(j + 1));
	        }
	        return result;
	        
	    }
	}
}
