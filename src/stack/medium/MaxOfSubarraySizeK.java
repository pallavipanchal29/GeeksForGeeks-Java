package stack.medium;

import java.util.ArrayList;
import java.util.Stack;

public class MaxOfSubarraySizeK {
    public static void main(String[] args) {
        ArrayList<Integer> ans = max_of_subarrays(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 9, 3);
        for (int i : ans)
            System.out.print(i + " ");
    }

    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {
        // For Finding Next Greater Element
        int[] nge = new int[arr.length]; // this is for storing indexes of next greater element
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; --i) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()])
                st.pop();
            if (st.isEmpty()) nge[i] = arr.length;
            else nge[i] = st.peek();
            st.push(i);
        }

        int[] ans = new int[arr.length - k + 1];
        int j = 0; // To travel in nge
        for (int i = 0; i <= arr.length - k; ++i) {
            if (j < i) j = i;
            while (nge[j] < i + k)
                j = nge[j];
            ans[i] = arr[j];
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : ans)
            res.add(i);
        return res;
    }
}
