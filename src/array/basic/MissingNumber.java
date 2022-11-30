package array.basic;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        System.out.println(missingNumber(arr, 4));
    }

    public static int missingNumber(int[] A, int N) {
        int expected = N * (N + 1) / 2;
        int actual = 0;
        for (int i = 0; i < A.length; i++)
            actual = actual + A[i];

        return Math.abs(expected - actual);
    }
}
