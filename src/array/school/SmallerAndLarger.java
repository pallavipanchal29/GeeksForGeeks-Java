package array.school;

//Incomplete
public class SmallerAndLarger {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 4};
        int[] ans = getMoreAndLess(arr, arr.length, 3);

        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] getMoreAndLess(int[] arr, int n, int x) {
        int lesser = 0;
        int greater = 0;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] <= x) {
                lesser = mid + 1;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        greater = arr[n - 1] == x ? lesser : n - lesser;
        return new int[]{lesser, greater};
    }
}
