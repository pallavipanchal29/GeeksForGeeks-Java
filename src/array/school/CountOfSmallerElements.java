package array.school;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        long[] arr = {1, 2, 2, 2, 5, 7, 9};
        System.out.println(countOfElementsBS(arr, arr.length, 2));
    }

    public static long countOfElements(long[] arr, long n, long x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) count++;
        }
        return count;
    }

    public static long countOfElementsBS(long[] arr, long n, long x) {
        int low = 0;
        int high = (int) (n - 1);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x && (mid == n - 1 || arr[mid] != x))
                return mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] <= x)
                low = mid + 1;
        }
        return high + 1;
    }
}
