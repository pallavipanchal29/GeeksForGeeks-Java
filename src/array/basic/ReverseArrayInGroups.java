package array.basic;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr, arr.size(), 3);

        for (int i : arr)
            System.out.print(i + " ");
    }

    //Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int[] a = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }

        for (int i = 0; i < n; i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }
        arr.clear();
        for (int i = 0; i < a.length; i++) {
            arr.add(a[i]);
        }
    }
}
