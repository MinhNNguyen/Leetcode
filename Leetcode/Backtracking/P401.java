/*
 *  10/08/2017
 *  Problem 401. Binary Watch
 *  Runtime ??
 *  Every time we tried a possible solution. If that works, we add that into to the return list, otherwise, we undo what we 
 *  did to come up with the result.
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class P401 {
	class Solution {
	    
	    List<String> res;
	    
	    public List<String> readBinaryWatch(int num) {
	        res  = new LinkedList<String>();
	        boolean[] light = new boolean[10];
	        helper(light, num, 0);
	        Collections.sort(res, String.CASE_INSENSITIVE_ORDER);
	        return res;
	    }

	    public void helper(boolean[] light, int num, int start) {
	        if (num == 0) {
	            int hour = 0; int minute = 0;
	            for (int i = 0; i < 4; i++) {
	                if (light[i]) hour += Math.pow(2, i);
	            }
	            if (hour > 11) return;
	            for (int i = 4; i < 10; i++) {
	                if (light[i]) minute += Math.pow(2, i - 4);
	            }
	            if (minute > 59) return;
	            if (minute >= 10) 
	                res.add(String.valueOf(hour) + ":" + String.valueOf(minute));
	            else
	                res.add(String.valueOf(hour) + ":0" + String.valueOf(minute));
	            return;
	        }
	        if (num > light.length - start)
	            return;
	        for (int i  =  start; i < light.length; i++) {
	            light[i] = true;
	            helper(light, num - 1, i + 1);
	            light[i] = false;
	        }
	    } 
	}
}
