package array.basic;

import java.util.HashMap;

public class MinDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(minDistHashmap(arr, arr.length, 1, 2));
    }

    //o(nsquare)
    static int minDist(int[] a, int n, int x, int y) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                int j = i;
                while (j < a.length) {
                    if (a[j] == y) {
                        minDistance = Math.min(j - i, minDistance);
                    }
                    j++;
                }
            }
            if (a[i] == y) {
                int j = i;
                while (j < a.length) {
                    if (a[j] == x) {
                        minDistance = Math.min(j - i, minDistance);
                    }
                    j++;
                }
            }
        }
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }
        return minDistance;
    }

    //Not working correctly - refactor
    static int minDistHashmap(int[] a, int n, int x, int y) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                if (a[i] == x && map.containsKey(y))
                    min = Math.min(Math.abs(i - map.get(y)), min);
                if (a[i] == y && map.containsKey(x))
                    min = Math.min(Math.abs(i - map.get(x)), min);
                map.put(a[i], i);
            } else if (a[i] == x) {
                if (map.containsKey(y))
                    min = Math.min(i - map.get(x), min);
            } else if (a[i] == y) {
                if (map.containsKey(x))
                    min = Math.min(i - map.get(y), min);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    static int minDistOptimized(int[] arr, int n, int x, int y) {
        int i = 0, p = -1, min_dist = Integer.MAX_VALUE;

        for (i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (p != -1 && arr[i] != arr[p])
                    min_dist = Math.min(min_dist, i - p);
                p = i;
            }
        }

        if (min_dist == Integer.MAX_VALUE)
            return -1;
        return min_dist;
    }

}
