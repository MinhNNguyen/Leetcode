/*
 *  09/16/2017
 *  Problem 637
 *  Runtime O(n)
 *  Use traditional BFS traverse through each level of the tree to find the average of each level
 *  and add those to the result array
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class P637 {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	 public List<Double> averageOfLevels(TreeNode root) {
	    List<Double> result = new ArrayList<Double>();
	    Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
	    if (root == null)
	    	return result;
	    queue.offer(root);
	    while (!queue.isEmpty()) {
            int size = queue.size();
            double average = 0;
            for (int i = 0; i < size; i++) {
                TreeNode newNode = queue.poll();
                if (newNode.left != null) queue.offer(newNode.left);
                if (newNode.right != null) queue.offer(newNode.right);
                average += (double) newNode.val / (double) size;
            }
            result.add(average);
        }
        return result;
    }
}
