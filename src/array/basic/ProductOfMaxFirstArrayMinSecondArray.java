package array.basic;

public class ProductOfMaxFirstArrayMinSecondArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 6, 2};
        int[] brr = {1, 2, 6, -1, 0, 9};
        System.out.println(find_multiplication(arr, brr, arr.length, brr.length));
    }

    // Function for finding maximum and value pair
    public static long find_multiplication(int[] arr, int[] brr, int n, int m) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            max = Math.max(max, arr[i]);
        for (int i = 0; i < m; i++)
            min = Math.min(min, brr[i]);
        return max * min;
    }
}
