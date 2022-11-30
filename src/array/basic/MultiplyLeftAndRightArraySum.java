package array.basic;

public class MultiplyLeftAndRightArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(multiply(arr, arr.length));
    }

    // Function for finding maximum and value pair
    public static int multiply(int[] arr, int n) {
        int p1 = 1;
        int p2 = 1;
        int mid = n / 2;
        for (int i = 0; i < mid; i++)
            p1 = p1 * arr[i];
        for (int i = mid; i < n; i++)
            p2 = p2 * arr[i];
        return p1 * p2;
    }
}
