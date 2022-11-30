package array.basic;

public class IshaanLovesChocolates {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 9};
        System.out.println(chocolates(arr.length, arr));
    }

    public static int chocolates(int n, int[] arr) {
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] > arr[j])
                i++;
            else j--;
        }
        return arr[i];
    }
}

