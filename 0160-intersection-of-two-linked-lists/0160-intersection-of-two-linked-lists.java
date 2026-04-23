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

        //checking size
        ListNode temp1 = headA;
        int count1 = 0;
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }

        ListNode temp2 = headB;
        int count2 = 0;
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }

        //taking Linked list of smaller size
        if (count1 > count2)
            return getIntersectionNode(headB, headA);

        Set<ListNode> set = new HashSet<>();

        //sorting Linked list in set
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        //checking element
        while (headB != null) {
            if (set.contains(headB))
                return headB;

            headB = headB.next;
        }

        return null;
    }
}