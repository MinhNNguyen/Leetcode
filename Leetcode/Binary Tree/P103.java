// 09/14/2017
// Problem 103
// Runtime O(n)
// Using DFS traversal the tree and the value of each node being encountered to the List to return


class Solution {
	
	/**
	 * Definition for a binary tree node.
	 */ public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        traverseLevel(result, root, 0);
        return result;
    }
    
    public void traverseLevel(List<List<Integer>> result, TreeNode root, int level)
    {
        if (root == null)
            return;
        
        if (level == result.s	ize())
        {
            List<Integer> current = new LinkedList<Integer>();
            current.add(root.val);
            result.add(current);  
        }
        else
        {
            List<Integer> current = result.get(level);
            if (level % 2 == 0)
                current.add(root.val);
            else
                current.add(0, root.val);
        }
        
            traverseLevel(result, root.left, level + 1);
            traverseLevel(result, root.right, level + 1);
    }
    
}