package array.basic;

import java.util.ArrayList;

public class FirstAndLastOccuranceOfX {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        ArrayList<Long> ans = find(arr, arr.length, 5);

        for (Long l : ans)
            System.out.print(l + " ");
    }

    static ArrayList<Long> find(long[] arr, int n, int x) {
        int first = FindFirstOccurance(arr, 0, n - 1, x);
        int last = FindLastOccurance(arr, 0, n - 1, x);
        ArrayList<Long> ans = new ArrayList<>();
        ans.add((long) first);
        ans.add((long) last);
        return ans;
    }

    private static int FindLastOccurance(long[] arr, int low, int high, int x) {
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

    private static int FindFirstOccurance(long[] arr, int low, int high, int x) {
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
