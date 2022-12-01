package array.basic;

import java.util.Arrays;

public class SortInSpecificOrder {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 5, 4, 7, 10};
        sortIt(arr, arr.length);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void sortIt(long[] arr, long n) {
        long[] temp = new long[(int) n];
        System.arraycopy(arr, 0, temp, 0, (int) n);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] % 2 == 0)
                temp[i] = temp[i] * -1;
        }
        Arrays.sort(temp);
        int index = 0;

        for (int i = temp.length - 1; i >= 0; i--) {
            if (temp[i] < 0) temp[i] = temp[i] * -1;
            arr[index++] = temp[i];
        }
    }
}
