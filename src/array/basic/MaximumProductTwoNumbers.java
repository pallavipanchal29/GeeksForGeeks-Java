package array.basic;

import java.util.Arrays;

public class MaximumProductTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        System.out.println(maxProduct(arr, arr.length));
    }

    static int maxProductArraySort(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1] * arr[n - 2];
    }

    static int maxProduct(int[] arr, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second)
                second = arr[i];
        }
        return first * second;
    }
}
