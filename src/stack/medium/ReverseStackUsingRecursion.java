package stack.medium;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);

        for (int i : stack)
            System.out.print(i + " ");
    }

    static void reverse(Stack<Integer> s) {
        if (s.isEmpty())
            return;
        int x = s.peek();
        s.pop();
        reverse(s);
        insertAtBottom(s, x);
    }

    private static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        } else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }
}
