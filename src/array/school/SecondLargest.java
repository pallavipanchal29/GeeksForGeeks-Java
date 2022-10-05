package array.school;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr, arr.length));
    }

    static int print2largest(int[] arr, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] > second)
                second = arr[i];
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
