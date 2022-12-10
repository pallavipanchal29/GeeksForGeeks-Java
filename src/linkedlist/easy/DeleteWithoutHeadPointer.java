package linkedlist.easy;

import linkedlist.Node;

public class DeleteWithoutHeadPointer {
    static void deleteNode(Node del) {
        del.data = del.next.data;
        del.next = del.next.next;
    }
}
