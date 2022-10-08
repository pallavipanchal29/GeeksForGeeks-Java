package array.basic;

import java.util.HashMap;

public class CheckIfTwoArraysEqual {
    public static void main(String[] args) {
        long[] A = {1, 2, 5, 4, 0};
        long[] B = {2, 4, 5, 0, 1};
        System.out.println(check(A, B, A.length));
    }

    //Function to check if two arrays are equal or not.
    public static boolean check(long[] A, long[] B, int N) {
        if (A.length != B.length) return false;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++)
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                if (map.get(B[i]) == 1)
                    map.remove(B[i]);
                else
                    map.put(B[i], map.get(B[i]) - 1);
            } else
                return false;
        }
        return map.size() == 0;
    }
}
