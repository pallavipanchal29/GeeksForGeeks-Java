package array.basic;

public class BalancedArray {
    public static void main(String[] args) {
        long[] arr = {1, 5, 3, 2};
        System.out.println(minValueToBalance(arr, arr.length));
    }

    static long minValueToBalance(long[] a, int n) {
        long s1 = 0;
        long s2 = 0;
        int mid = n / 2;
        for (int i = 0; i < mid; i++)
            s1 = s1 + a[i];
        for (int i = mid; i < n; i++)
            s2 = s2 + a[i];
        return Math.abs(s1 - s2);
    }
}
