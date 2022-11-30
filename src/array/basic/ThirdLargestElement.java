package array.basic;

import java.util.*;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(thirdLargestPriorityQueue(arr, arr.length));
    }

    static int thirdLargest(int[] a, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] != first && a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] != second && a[i] > third)
                third = a[i];
        }
        return third;
    }

    static int thirdLargestArraySort(int[] a, int n) {
        boolean allSame = Arrays.stream(a).allMatch(s -> s == (a[0]));
        if (allSame) return -1;

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        int[] temp = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < temp.length; i++)
            temp[i] = it.next();
        return temp[temp.length - 2];
    }

    static int thirdLargestPriorityQueue(int[] a, int n) {
        boolean allSame = Arrays.stream(a).allMatch(s -> s == (a[0]));
        if (allSame) return -1;

        int index = 3;
        int ans = Integer.MIN_VALUE;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++)
            if (!queue.contains(a[i])) queue.add(a[i]);

        while (index > 0) {
            ans = queue.poll();
            index--;
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
