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
        ListNode tA = headA;
        ListNode tB = headB;

        //count no. element in headA
        int cA = 0;
        while (tA != null) {
            cA++;
            tA = tA.next;
        }

        //counting no. element in headB
        int cB = 0;
        while (tB != null) {
            cB++;
            tB = tB.next;
        }

        ListNode a = headA;
        ListNode b = headB;

        //taking list with more no. elements
        if (cA < cB)
            return getIntersectionNode(headB, headA);

        //calculation differecne in no. of elements
        int diff = cA - cB;

        //move a until diff greater than 0
        while (diff > 0) {
            a = a.next;
            diff--;
        }

        //now move both a and b till null
        while (a != null && b != null) {
            //if they match at any element return that
            if (a == b)
                return a;
                
            a = a.next;
            b = b.next;
        }

        //if not matched return null
        return null;
    }
}