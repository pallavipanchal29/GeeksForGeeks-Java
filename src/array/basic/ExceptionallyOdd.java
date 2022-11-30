package array.basic;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr, arr.length));
    }

    static int getOddOccurrence(int[] arr, int n) {
        int ans = arr[0];
        for (int i = 1; i < n; i++)
            ans = ans ^ arr[i];
        return ans;
    }
}
