package array.basic;

public class NumberOfOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr, arr.length, 2));
    }

    static int count(int[] arr, int n, int x) {
        int first = FindFirstOccurance(arr, 0, n - 1, x);
        int last = FindLastOccurance(arr, 0, n - 1, x);
        if (first == -1 || last == -1) return 0;

        return last - first + 1;
    }

    private static int FindLastOccurance(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x && (mid == arr.length - 1 || arr[mid + 1] != x))
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] <= x)
                low = mid + 1;
        }
        return -1;
    }

    private static int FindFirstOccurance(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x && (mid == 0 || arr[mid - 1] != x))
                return mid;
            else if (arr[mid] >= x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
        }
        return -1;
    }
}
