package linkedlist.easy;

import linkedlist.Node;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedLL {
    //Function to remove duplicates from unsorted linked list.
    public static Node removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
