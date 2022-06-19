/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if (head == null || head.next == null) return false;
        HashSet<ListNode> map = new HashSet<>();
        ListNode root = head;
        map.add(root);
        root = root.next;
        while (root!= null){
            if (map.contains(root))return true;
            map.add(root);
            root = root.next;
        }
        return false;
    }
}