package linkedlist.easy;

import linkedlist.Node;

import java.util.Stack;

public class PrintReverseLLWithoutReversing {
    static void printReverseRecursive(Node head) {
        if (head == null) return;
        printReverseRecursive(head.next);
        System.out.print(head.data + " ");
    }

    static void printReverseStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (stack.empty() == false) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
