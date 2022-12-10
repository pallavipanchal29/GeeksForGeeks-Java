package linkedlist.basic;

public class ImplementStackUsingLL {
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a) {
        if (top == null)
            top = new StackNode(a);
        else {
            StackNode node = new StackNode(a);
            node.next = top;
            top = node;
        }
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }
}
