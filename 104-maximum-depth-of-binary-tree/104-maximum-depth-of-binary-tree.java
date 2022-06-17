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
    public int maxDepth(TreeNode root) {
          if (root == null) return 0;
        return maxDepth2(root,0);
    }
    public int maxDepth2(TreeNode root,int len) {
        if (root == null) return len;
        int left = maxDepth2(root.left,len+1);
        int right = maxDepth2(root.right,len+1);
        return Math.max(left,right);
    }
}