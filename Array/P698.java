import java.util.HashMap;

public class P698 {
	class Solution {
	    HashMap<Integer, Integer> map;
	    boolean can = false;
	    public boolean canPartitionKSubsets(int[] nums, int k) {
	        map = new HashMap<Integer, Integer>();
	        process(nums, 0, 0, k);
	        return can;
	    }
	    
	    public void process(int[] nums, int sum, int start, int k) {
	        if (sum != 0) {
	            if (map.containsKey(sum))
	                map.put(sum, map.get(sum) + 1);
	            else
	                map.put(sum, 1 );
	            if (map.get(sum) >= k) {
	                can = true;
	            }

	        }

	        for (int i = start; i < nums.length; i++) {
	            process(nums, sum + nums[i], i + 1, k);
	        }
	    }
	    
	}
}
