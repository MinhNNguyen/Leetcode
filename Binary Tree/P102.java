import java.awt.List;
/*
 *  09/14/2017
 *  Problem 103
 *  Runtime O(n)
 *  Using DFS traversal the tree and add the node to the list based on level variable passed. 
 *  Always push the value of the node being encountered to the end of each list
 */

public class P102 {

	/**
	 * Definition for a binary tree node.
	 */ public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new LinkedList<List<Integer>>();
	        if (root == null)
	            return result;
	        Queue<TreeNode> stack = new LinkedList<TreeNode>();
	        stack.add(root);
	        while (!stack.isEmpty())
	        {
	            Queue<TreeNode> bench = new LinkedList<TreeNode>();
	            List<Integer> level = new LinkedList<Integer>();
	            while(!stack.isEmpty())
	            {
	                TreeNode node = stack.poll();
	                level.add(node.val);
	                if (node.left != null)
	                    bench.add(node.left);
	                if (node.right != null)
	                    bench.add(node.right);
	            }
	            result.add(level);
	            stack = bench; 
	        }
	        
	        
	        
	        return result;
	    }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
