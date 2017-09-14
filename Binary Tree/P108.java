/*
 *  09/14/2017
 *  Problem 108
 *  Runtime O(n)
 *  Build SubTree
 */
import java.util.Arrays;


public class P108 {
	
	 public static class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }

	    public TreeNode sortedArrayToBST(int[] nums) {
	        if ( nums.length == 0 )
	            return null;
	        int rIndex = nums.length / 2;
	        TreeNode root = new TreeNode(nums[rIndex]);
	        if (rIndex > 0)
	            buildSubTree(root, Arrays.copyOfRange(nums, 0, rIndex));
	        if (rIndex < nums.length - 1)
	            buildSubTree(root, Arrays.copyOfRange(nums, rIndex + 1, nums.length));
	        return root;
	    }
	    
	    public void buildSubTree(TreeNode parent,int[] nums)
	    {
	        int index = nums.length / 2;
	        TreeNode newNode = new TreeNode(nums[index]);
	        if (nums[index] < parent.val)
	            parent.left = newNode;
	        else
	            parent.right = newNode;
	        if (index > 0)
	            buildSubTree(newNode, Arrays.copyOfRange(nums, 0, index));
	        if (index < nums.length -1)
	            buildSubTree(newNode, Arrays.copyOfRange(nums, index + 1, nums.length));
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrays = {1, 3, 4, 5};
		//sortedArrayToBST(arrays);
		int[] sub = Arrays.copyOfRange(arrays, 1, 4);
		for (int e: sub)
			System.out.println(e);
		
	}

}
