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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        if (root.right == null && root.left == null){
            list.add(root.val);
            return list;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.push(root);
        while (nodes.size()>0){
            TreeNode node = nodes.poll();
            list.add(node.val);
            if (node.right != null)
                nodes.push(node.right);
            if (node.left != null)
                nodes.push(node.left);
        }
        return list;
    }
}