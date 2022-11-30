package array.basic;

public class IndexFirstOneSortedArrayZeroOne {
    public static void main(String[] args) {
        long[] arr = {0, 0, 0};
        System.out.println(firstIndex(arr, arr.length));
    }

    public static long firstIndex(long[] arr, long n) {
        int low = 0;
        int high = (int) (n - 1);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0))
                return mid;
            else if (arr[mid] == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
