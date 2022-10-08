package array.basic;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr, arr.length));
    }

    static int thirdLargest(int[] a, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] != first && a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] != second && a[i] > third)
                third = a[i];
        }
        return third;
    }
}
