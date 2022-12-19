package stack.easy;

import java.util.Stack;

public class SortStackDecreasing {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(32);
        stack.push(3);
        stack.push(41);
        Stack<Integer> sorted = sortDecreasing(stack);
        for (int i : sorted)
            System.out.print(i + " ");

    }

    public static Stack<Integer> sortDecreasing(Stack<Integer> s) {
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = new int[s.size()];
        int ind = 0;
        while (!s.isEmpty())
            arr[ind++] = s.pop();


        for (int i = 0; i < arr.length; i++) {
            int elm = arr[i];
            if (ans.isEmpty())
                ans.push(elm);
            else {
                while (!ans.isEmpty() && ans.peek() < elm) {
                    temp.push(ans.pop());
                }
                ans.push(elm);
                while (!temp.isEmpty())
                    ans.push(temp.pop());
            }
        }
        return ans;
    }
}
