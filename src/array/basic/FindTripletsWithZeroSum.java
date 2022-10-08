package array.basic;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {60, -65, 5, -21, 8, 93};
        System.out.println(findTriplets(arr, arr.length));
    }

    public static boolean findTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) return true;
                else if (sum < 0) j++;
                else k--;
            }
        }
        return false;
    }
}
