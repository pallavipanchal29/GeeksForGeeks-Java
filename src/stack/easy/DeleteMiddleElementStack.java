package stack.easy;

import java.util.Stack;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        deleteMid(stack, stack.size());

        for (int i : stack)
            System.out.print(i + " ");
    }

    //Function to delete middle element of a stack.
    public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
        int mid = (int) Math.ceil((sizeOfStack + 1) / 2);
        deleteMidElement(s, mid, 0);
    }

    private static void deleteMidElement(Stack<Integer> s, int mid, int curr) {
        if (s.isEmpty() || curr == s.size())
            return;
        int x = s.pop();
        deleteMidElement(s, mid, curr + 1);
        if (curr != mid)
            s.push(x);
    }
}
