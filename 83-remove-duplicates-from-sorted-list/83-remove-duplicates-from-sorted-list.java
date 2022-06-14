/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode list =null;
        ListNode ref = null;
        int temp = -200;
        while (head !=null){
            if (list == null) {
                list = new ListNode(head.val);
                ref = list;
                temp = head.val;
                head = head.next;
                continue;
            }
            if (temp != head.val){
                temp = head.val;
                list.next = new ListNode(head.val);
                list = list.next;
                head = head.next;
                continue;
            }
            head = head.next;

        }
        return ref;
    }
}