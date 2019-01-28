// Two soluions for the problem Given an array, rotate the array to the right by k steps, where k is non-negative.

// Solution 1. Rotate the array once. Then rotate from 0 to k - 1 and rotate k to end index
// Space O(1) and Time O(n)

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        partialRotate(nums, 0, nums.length - 1);
        partialRotate(nums, 0, k - 1);
        partialRotate(nums, k, nums.length - 1);
    }
    
    public void partialRotate(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}

// Solution 2. Swap the position by k for number of elements of the index times. 

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int cur = start;
            int prev = nums[start];
            do {
                int next = (cur + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                cur = next;
                count++;
            } while ( start != cur);
        }
    }
}