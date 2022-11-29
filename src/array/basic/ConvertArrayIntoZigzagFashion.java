package array.basic;

public class ConvertArrayIntoZigzagFashion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr, arr.length);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    static void zigZag(int[] arr, int n) {
        boolean greater = false;
        boolean lesser = true;

        for (int i = 1; i < n; i++) {
            if (lesser) {
                if (arr[i] < arr[i - 1]) {
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;

                }
                lesser = false;
                greater = true;
            } else if (greater) {
                if (arr[i] > arr[i - 1]) {
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;

                }
                lesser = true;
                greater = false;
            }
        }
    }
}
