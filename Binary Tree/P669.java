/*
 *  09/16/2017
 *  Problem 669
 *  Runtime O(n)
 *  Since this is binary search tree, using recursive to loop from the top. If the value of root is out of
 *  the range [L,R], there are 2 cases either it is val > R -> return root trimBST of left tree, else if val < R
 *  -> return the root trimBST of right tree
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class P669 {

	
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;
        if (root.val > R)
            return trimBST(root.left, L, R);
        if (root.val < L)
            return trimBST(root.right, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
