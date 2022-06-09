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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode container = null;
        ListNode ref=null;
        while (list1!=null && list2!=null){
            if (list1.val <= list2.val){
                if (container == null){
                    container = new ListNode(list1.val);
                    ref = container;
                    list1 = list1.next;
                    continue;
                }
                ref.next = new ListNode(list1.val);
                ref = ref.next;
                list1 = list1.next;
            }
            else {
                if (container == null){
                    container = new ListNode(list2.val);
                    ref = container;
                    list2 = list2.next;
                    continue;
                }
                ref.next = new ListNode(list2.val);
                ref = ref.next;
                list2 = list2.next;
            }
        }
        
        while(list1 != null){
            if (container == null){
                container = new ListNode(list1.val);
                ref = container;
                list1 = list1.next;
                continue;
            }
            ref.next = new ListNode(list1.val);
            ref = ref.next;
            list1 = list1.next;
        }
        while(list2!= null){
            if (container == null){
                container = new ListNode(list2.val);
                ref = container;
                list2 = list2.next;
                continue;
            }
            ref.next = new ListNode(list2.val);
            ref = ref.next;
            list2 = list2.next;
        }
        return container;
    }
}