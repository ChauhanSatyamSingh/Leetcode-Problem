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
        int l = 0;
        ListNode curr = head;

        //calculate length
        while(curr != null) {
            l++;
            curr = curr.next;
        }

        int jump = l - n;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        curr = dummy;

        while(jump > 0) {
            curr = curr.next;
            jump--;
        }

        curr.next = curr.next.next;

        return dummy.next;

    }
}