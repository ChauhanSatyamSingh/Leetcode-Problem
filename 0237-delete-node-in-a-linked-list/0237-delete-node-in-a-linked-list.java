/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 4, 5, 1, 9
        //    n

        node.val = node.next.val;
        // 4, 1, 1, 9
        //    n

        node.next = node.next.next;
        // 4, 1, 9
    }
}