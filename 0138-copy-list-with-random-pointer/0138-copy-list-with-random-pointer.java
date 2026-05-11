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

        Map<Node, Node> map = new HashMap<>();

        Node newHead = new Node(head.val);

        map.put(head, newHead);

        Node curr = head,
             newCurr = newHead;

        while(curr != null) {
            if(curr.random != null) {
                if(map.get(curr.random) != null) {
                    newCurr.random = map.get(curr.random);
                }else {
                    Node node = new Node(curr.random.val);
                    map.put(curr.random, node);
                    newCurr.random = node;
                }
            }

            if(curr.next != null) {
                if(map.get(curr.next) != null) {
                    newCurr.next = map.get(curr.next);
                }else {
                    Node node = new Node(curr.next.val);
                    map.put(curr.next, node);
                    newCurr.next = node;
                }
            }

            curr = curr.next;
            newCurr = newCurr.next;
        } 
        return newHead;
    }
}