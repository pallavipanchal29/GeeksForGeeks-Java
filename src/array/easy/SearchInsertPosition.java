package array.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsertK(new int[]{1, 3, 5, 6}, 4, 5));
    }

    static int searchInsertK(int[] Arr, int N, int k) {
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Arr[mid] == k)
                return mid;
            else if (Arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
