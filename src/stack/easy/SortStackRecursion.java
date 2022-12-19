package stack.easy;

import java.util.Stack;

public class SortStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(32);
        stack.push(3);
        stack.push(41);
        Stack<Integer> sorted = sortIncreasingRecursion(stack);
        for (int i : sorted)
            System.out.print(i + " ");

    }

    public static Stack<Integer> sortIncreasingRecursion(Stack<Integer> s) {
        SortStack(s);
        return s;
    }

    private static void SortStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            int x = s.pop();
            SortStack(s);

            SortedInsert(s, x);
        }

    }

    private static void SortedInsert(Stack<Integer> s, int x) {
        while (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        SortedInsert(s, temp);

        s.push(temp);
    }
}
