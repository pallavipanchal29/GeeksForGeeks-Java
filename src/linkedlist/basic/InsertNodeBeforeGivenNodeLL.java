package linkedlist.basic;

import linkedlist.Node;

public class InsertNodeBeforeGivenNodeLL {
    static Node head;

    public void addBefore(Node given_ptr, int val) {
        //if given_ptr is head
        Node node = new Node(val);
        if (given_ptr == head) {
            node.next = head;
            head.next = node;
            return;
        } else {
            Node temp = head;
            Node prev = head;
            while (temp != null && temp != given_ptr) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = node;
            node.next = temp;
        }

    }
}
