package linkedlist.basic;

import linkedlist.Node;

public class NodeAtGivenIndexLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(657);
        head.next.next.next.next.next = new Node(76);
        System.out.println(getNth(head, 5));

    }

    public static int getNth(Node node, int ind) {
        int count = 1;
        while (node.next != null && count < ind) {
            node = node.next;
            count++;
        }
        return node.data;
    }
}
