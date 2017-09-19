import java.util.Arrays;




public class P16 {

    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int size = nums.length;
        if (size <= 3)
        {
            for( int i = 0; i < size; i++)
                sum += nums[i];
            return sum;
        }
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        
        for (int i = 0; i < size - 2; i++){
            int j = i + 1;
            int k = size - 1;
            int temp = 0;
            int gap = Integer.MAX_VALUE;
            while ( j < k) {
                int current = nums[i] + nums[j] + nums[k];
                System.out.println( nums[i] + " " + nums[j] + " " + nums[k] + " " + current);
                if (Math.abs(current - target) < gap) {
                    temp = current;
                    gap = Math.abs(current -target);
                }
                if (current > target)
                    k--;
                else
                    j++;
            }
            if (gap < closest) {
                sum = temp;
                closest = gap;
            }
        }
        
        return sum;       
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,-1,-2};
		System.out.println(threeSumClosest(array, 4));
	}

}
