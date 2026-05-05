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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }

        k %= size;
        if(k == 0) return head;


        int diff = size - k;

        ListNode newTail = head;
        for(int i = 1; i < diff; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        ListNode tail = newHead;
        for(int i = 1; i < k; i++) tail = tail.next;

        tail.next = head;

        return newHead;

    }
}