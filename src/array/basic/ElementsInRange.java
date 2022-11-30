package array.basic;

import java.util.HashSet;

public class ElementsInRange {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(arr, arr.length, 2, 6));
    }

    static boolean check_elements(int[] arr, int n, int A, int B) {
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= A && arr[i] <= B)
                ans.add(arr[i]);
        }
        return (ans.size() == (B - A + 1));
    }
}
