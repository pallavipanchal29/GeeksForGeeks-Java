package array.basic;

public class QuickLeftRotation {
    public static void main(String[] args) {
        long[] arr = {80, -62, -90, 7, 50, -41, 70, 8, -7, -9, 44, 22, -57, -97, 26, 72, 95, -39, 65, -51, 52, -29, -18, 4, 98, -3, 95, -11, -90};
        leftRotate(arr, 9944, 29);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void leftRotate(long[] arr, int k, int n) {
        long[] temp = new long[n];
        //this is even though k > n
        k = k % n;

        int count = 0;
        for (int i = k; i < n; i++) {
            temp[count] = arr[i];
            count++;
        }
        for (int j = 0; j < k; j++) {
            temp[count] = arr[j];
            count++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

}
