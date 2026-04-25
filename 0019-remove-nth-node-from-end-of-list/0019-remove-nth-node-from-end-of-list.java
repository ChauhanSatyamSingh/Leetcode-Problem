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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;

        //jump curr till n != 0;
        while (n > 0) {
            curr = curr.next;
            n--;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        while (curr != null) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = prev.next.next;

        return dummy.next;
    }
}