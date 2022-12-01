package array.basic;

public class PlayWithOr {
    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 2, 3};
        int[] res = game_with_number(arr, arr.length);

        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

    // Function for finding maximum and value pair
    public static int[] game_with_number(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i] | arr[i + 1];
        }
        return arr;
    }
}
