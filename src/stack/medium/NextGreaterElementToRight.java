package stack.medium;

import java.util.Stack;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        long[] ans = nextLargerElement(new long[]{6, 8, 0, 1, 3}, 5);
        for (long i : ans)
            System.out.print(i + " ");
    }

    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] re = new long[n];
        Stack<Long> st = new Stack<>();

        st.push(arr[n - 1]);
        re[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            //when stack is not empty and top element is less than equal to current element pop it from stack
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                if (st.peek() <= arr[i]) {
                    st.pop();
                }
            }
            //if stack is empty push element and add -1 to answer
            if (st.isEmpty()) {
                st.push(arr[i]);
                re[i] = -1;
            }
            //if top element is greater than current element add it to answer
            if (st.peek() > arr[i]) {
                re[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return re;
    }
}
