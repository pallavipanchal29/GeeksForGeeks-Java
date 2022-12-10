package linkedlist.basic;

import linkedlist.Node;

public class InsertInMiddleLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);

        head = insertInMid(head, 3);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //Works for lower number of elements
    public static Node insertInMidBruteForce(Node head, int data) {
        int len = 0;
        Node temp = head;
        Node prev = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int mid = len % 2 == 0 ? len / 2 : len / 2 + 1;
        int ind = 0;
        temp = head;
        while (temp.next != null && ind < mid) {
            prev = temp;
            temp = temp.next;
            ind++;
        }
        Node node = new Node(data);
        prev.next = node;
        node.next = temp;
        return head;
    }

    public static Node insertInMid(Node head, int data) {
        if (head == null)
            return null;
        Node node = new Node(data);
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }
}
