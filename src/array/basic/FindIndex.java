package array.basic;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int[] res = findIndex(arr, arr.length, 5);
        System.out.println(res[0] + " " + res[1]);
    }

    // Function to find starting and end index
    static int[] findIndex(int[] a, int N, int key) {
        int i = 0;
        int j = N - 1;

        while (i < N && a[i] != key) i++;
        while (j >= 0 && a[j] != key) j--;

        i = i == N ? -1 : i;
        return new int[]{i, j};
    }
}
