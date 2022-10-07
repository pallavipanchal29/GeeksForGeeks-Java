package array.basic;

public class BinarySearch {
    static int binarysearch(int[] arr, int n, int k) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarysearch(arr, arr.length, 4));
    }
}
