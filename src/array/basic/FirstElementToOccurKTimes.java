package array.basic;

import java.util.TreeMap;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(arr, arr.length, 2));
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if (map.get(a[i]) == k)
                return a[i];
        }
        return -1;
    }
}
