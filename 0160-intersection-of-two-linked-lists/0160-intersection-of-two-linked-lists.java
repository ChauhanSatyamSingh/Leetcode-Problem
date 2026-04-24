/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //hogya
        ListNode a = headA;
        ListNode b = headB;

        int cA = 1;
        while(a != null) {
            cA++;
            a = a.next;
        }

        int cB = 1;
        while(b != null) {
            cB++;
            b = b.next;
        }

        if(cB < cA) 
            return getIntersectionNode(headB, headA);

        int diff = cB - cA;

        a = headA;
        b = headB;
        while(diff >= 1) {
            b = b.next;
            diff--;
        }

        while(a != null && b != null) {
            if(a == b) return a;

            a = a.next;
            b = b.next;
        }

        return null;
    }
}