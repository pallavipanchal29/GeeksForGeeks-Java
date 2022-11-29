package array.basic;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        long[] arr = {3, 2, 1, 56, 10000, 167};
        pair p = getMinMax(arr, arr.length);
        System.out.println(p.first + " " + p.second);
    }

    static pair getMinMax(long[] a, long n) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        return new pair(min, max);
    }

    static class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
}
