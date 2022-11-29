package array.school;

import java.util.Arrays;

public class PrintLeftElement {
    public static void main(String[] args) {
        long[] arr = {8, 1, 2, 9, 4, 3, 7, 5};
        //1,2,3,4,5,7,8,9
        System.out.println(leftElement(arr, arr.length));
    }

    public static long leftElement(long[] arr, long n) {
        Arrays.sort(arr);
        int i = 0;
        int j = (int) (n - 1);
        while (i <= j) {
            i++;
            j--;
        }
        return n % 2 == 0 ? arr[i] : arr[i - 1];
    }
}
