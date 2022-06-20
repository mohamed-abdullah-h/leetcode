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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        if (root.right == null && root.left == null){
            list.add(root.val);
            return list;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.push(root);
        TreeNode leftNode = root.left;
        TreeNode temp = root;
        while (nodes.size()>0){
          while (leftNode != null && leftNode != temp){
                nodes.push(leftNode);
                leftNode=leftNode.left;
            }
            TreeNode node = nodes.peek();
            if (node.right != null && node.right != temp)leftNode = node.right;
            else {
                nodes.poll();
                temp=node;
                list.add(node.val);
                if (nodes.peek() == null)break;
            }
        }
        return list; 
    }
}