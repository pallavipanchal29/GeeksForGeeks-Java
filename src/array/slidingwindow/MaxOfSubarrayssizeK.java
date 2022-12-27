package array.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxOfSubarrayssizeK {
    public static void main(String[] args) {
        ArrayList<Integer> ans = max_of_subarrays(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 9, 3);
        for (int i : ans)
            System.out.print(i + " ");
    }

    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int[] a, int n, int k) {
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, j = 0, l = 0;
        while (j < n) {
            //to keep track of maximum element all the time
            while (dq.size() > 0 && a[j] > dq.peekLast()) {
                dq.removeLast();
            }
            dq.add(a[j]);

            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                //get first element of deque that is max element
                res[l++] = dq.peekFirst();
                if (dq.peekFirst() == a[i]) {
                    dq.remove(a[i]);
                }
                i++;
                j++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int e : res)
            ans.add(e);
        return ans;
    }
}
