package array.school;

import java.util.Arrays;

public class AtLeastTwoGreaterElements {
    public static void main(String[] args) {
        long[] arr = {2, 8, 7, 1, 5};
        long[] ans = findElements(arr, arr.length);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    public static long[] findElements(long[] a, long n) {
        long[] ans = new long[(int) (n - 2)];
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++)
            ans[i] = a[i];
        return ans;
    }
}
