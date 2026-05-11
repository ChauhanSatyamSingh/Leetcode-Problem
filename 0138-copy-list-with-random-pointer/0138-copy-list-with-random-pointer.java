/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head,
             newCurr = head;

        while(curr != null) {
            Node node = new Node(curr.val);
            Node currNext = curr.next;
            node.next = curr.next;
            curr.next = node;
            curr = currNext;
        }


        curr = head;
        while(curr != null) {
            Node newNode = curr.next;
            newNode.random = curr.random != null ? curr.random.next : null;  
            curr = curr.next.next;
        }


        Node oldHead = head,
             newHead = head.next,
             resultHead = head.next;

        while(oldHead != null) {
            oldHead.next = newHead.next;
            oldHead = newHead.next;
            newHead.next = oldHead != null ? oldHead.next : null;
            newHead = newHead.next;
        }

        return resultHead;
    }
}