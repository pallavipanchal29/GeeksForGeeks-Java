package linkedlist.basic;

import linkedlist.Node;

public class CountNodesOfLL {
    //Function to count nodes of a linked list.
    public static int getCount(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
