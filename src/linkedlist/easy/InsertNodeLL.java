package linkedlist.easy;

import linkedlist.Node;

public class InsertNodeLL {
    public static void main(String[] args) {
        Node head = new Node(9);
    }

    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        if (head == null)
            head = new Node(x);
        else {
            Node node = new Node(x);
            node.next = head;
            head = node;
        }

        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        if (head == null)
            head = new Node(x);
        else {
            Node node = new Node(x);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }
}
