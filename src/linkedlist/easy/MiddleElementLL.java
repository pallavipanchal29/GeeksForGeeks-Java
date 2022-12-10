package linkedlist.easy;

import linkedlist.Node;

public class MiddleElementLL {
    public static int getMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        while (slow != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return count % 2 == 0 ? slow.next.data : slow.data;
    }
}
