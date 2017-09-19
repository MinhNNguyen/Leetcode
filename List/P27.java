/*
 *  09/16/2017
 *  Problem 27
 *  Runtime O(n)
 *  Iterate through the array, if the number in the array is equal to the value to be removed, increment the
 *  number of removed by 1, if the number is not the number to be removed then move it forward by the number of 
 *  element already got removed
 */

public class P27 {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int removed = 0;
        for ( int i = 0; i < length; i++) {
            if ( nums[i] == val )
                removed++;
            else {
                nums[i - removed] = nums[i];
            }
        }
        return length - removed;
    }
}
