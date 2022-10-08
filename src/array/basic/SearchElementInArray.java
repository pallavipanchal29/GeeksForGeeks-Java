package array.basic;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(search(arr, arr.length, 3));
    }

    static int search(int[] arr, int N, int X) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X)
                return i;
        }
        return -1;
    }
}
