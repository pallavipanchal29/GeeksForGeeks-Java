package array.basic;

public class MaximumInStructArray {
    public static void main(String[] args) {
        Height h1 = new Height(1, 2);
        Height h2 = new Height(2, 1);
        Height[] arr = new Height[]{h1, h2};
        System.out.println(findMax(arr, arr.length));

    }

    public static int findMax(Height[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int inches = arr[i].inches + (arr[i].feet * 12);
            max = Math.max(inches, max);
        }
        return max;
    }

    static class Height {
        int feet;
        int inches;

        public Height(int ft, int inc) {
            feet = ft;
            inches = inc;
        }
    }
}
