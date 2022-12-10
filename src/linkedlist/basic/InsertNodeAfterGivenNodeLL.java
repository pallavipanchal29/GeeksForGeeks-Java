package linkedlist.basic;

import linkedlist.Node;

public class InsertNodeAfterGivenNodeLL {
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) return;
        Node node = new Node(new_data);
        node.next = prev_node.next;
        prev_node.next = node;
    }
}
