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
    public boolean isBalanced(TreeNode root) {
      if (root == null) return true;
    int mx = isBalanced2(root);
    return mx<6000;
    }
    public int isBalanced2(TreeNode root) {
        int left = 0;
        int right = 0;
        if (root.left != null){
            left++;
            left += isBalanced2(root.left);
        }
        if (root.right != null){
            right++;
            right += isBalanced2(root.right);
        }
        if (left >= 6000 || right >= 6000) return 6000;
        if (diff(left,right) <= 1 )return Math.max(left,right);
        return 6000;
    }
    public int diff(int x, int y){
        if (x > y)return x-y;
        return y-x;
    }
}