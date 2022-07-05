 import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       BigInteger sum1 = sumOfList(l1);
       BigInteger sum2 = sumOfList(l2);
       BigInteger sum_all = sum1.add(sum2);
       String all = sum_all.toString();
       StringBuilder sb = new StringBuilder(all);
       all = sb.reverse().toString();
       ListNode list = null;
       ListNode head = null;
        for (char c : all.toCharArray()) {
            if (list == null){
                list = new ListNode();
                head = list;
            }
           else {
                head.next = new ListNode();
                head = head.next;
            }
            head.val=Integer.parseInt(c+"");
        }
       return list;
    }
    public BigInteger sumOfList(ListNode l1) {
        StringBuilder sb = new StringBuilder();
        while (l1!=null){
        sb.append(l1.val);
        l1 = l1.next;
        }
        String s = sb.reverse().toString();
        return new BigInteger(s);
    }
}