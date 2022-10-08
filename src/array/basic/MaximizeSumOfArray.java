package array.basic;

import java.util.Arrays;

public class MaximizeSumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(Maximize(arr, arr.length));
    }

    static int Maximize(int[] arr, int n) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i] * i;
        }
        return sum;
    }
}
