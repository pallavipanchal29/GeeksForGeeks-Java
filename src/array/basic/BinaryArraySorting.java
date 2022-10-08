package array.basic;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0};
        binSort(arr, arr.length);

        for (int i : arr)
            System.out.print(i + " ");
    }

    static void binSort(int[] A, int N) {
        int low = 0;
        int high = N - 1;

        while (low < high) {
            if (A[low] == 0)
                low++;
            else if (A[high] == 1)
                high--;
            else if (A[low] == 1 && A[high] == 0) {
                int t = A[low];
                A[low] = A[high];
                A[high] = t;
                low++;
                high--;
            }
        }
    }
}
