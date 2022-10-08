package array.basic;

import java.util.Arrays;

public class MaximizeSumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(Maximize(arr, arr.length));
    }

    static int Maximize(int[] arr, int n) {
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (long) arr[i] * i;
        }
        return (int) (sum % (1000000007));
    }
}
