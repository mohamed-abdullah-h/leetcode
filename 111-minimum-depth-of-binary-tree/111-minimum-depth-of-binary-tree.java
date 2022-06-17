/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
       if (root == null) return 0;
        return minDepth2(root,1); 
    }
    public int minDepth2(TreeNode root,int min) {
        if (root.left == null && root.right == null) return min;
        int left = 0;
        int right = 0;
        if (root.left!= null)
            left = minDepth2(root.left,min+1);
        if (root.right != null)
            right = minDepth2(root.right,min+1);
         if (left == 0 || right == 0) return Math.max(left,right);
        return Math.min(left,right);

    }
}