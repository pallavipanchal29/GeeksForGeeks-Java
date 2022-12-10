package linkedlist.easy;

import linkedlist.Node;

public class InsertInSortedList {
    public static void main(String[] args) {
        Node head = new Node(25);
        head.next = new Node(36);
        head.next.next = new Node(47);
        head.next.next.next = new Node(58);
        head.next.next.next.next = new Node(69);
        head.next.next.next.next.next = new Node(80);

        head = sortedInsert(head, 50);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node sortedInsert(Node head, int key) {
        Node current;
        Node node = new Node(key);

        if (head == null || head.data >= key) {
            node.next = head;
            head = node;
        } else {
            current = head;
            while (current.next != null && current.next.data < key) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;
        }
        return head;
    }
}
