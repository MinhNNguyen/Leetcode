/*
 *  10/09/2017
 *  Problem 95. Unique Binary Search Trees II
 *  Runtime O(m * n)
 */

import java.awt.List;
import java.util.ArrayList;


public class P95 {

		public class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		 }
		
	    public List<TreeNode> generateTrees(int n) {
	        List<TreeNode>[] array = new List[n + 1];
	        array[0] = new ArrayList<TreeNode>();
	        if ( n == 0)
	            return array[0];
	        array[0].add(null);
	        for (int len = 1; len <= n; len++) {
	            array[len] = new ArrayList<TreeNode>();
	            for (int i = 0; i < len; i++ ) {
	                for (TreeNode l: array[i]) {
	                    for (TreeNode r: array[len - i - 1]) {
	                        TreeNode root = new TreeNode(i + 1);
	                        root.left = l;
	                        root.right = clone(r, i + 1);
	                        array[len].add(root);   
	                    }
	                }
	            }
	        }
	        return array[n];
	    }
	    
	    
	    public TreeNode clone(TreeNode node, int offset) {
	        if (node == null)
	            return null;
	        TreeNode newNode = new TreeNode( node.val + offset);
	        newNode.left = clone(node.left, offset);
	        newNode.right = clone(node.right, offset);
	        return newNode;
	    }
	    
}
