package array.school;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int[] ans = findIndex(arr, arr.length, 5);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    static int[] findIndex(int[] a, int N, int key) {
        int i = 0;
        int j = N - 1;

        while (i < N && a[i] != key) i++;
        while (j >= 0 && a[j] != key) j--;

        i = i == N ? -1 : i;
        return new int[]{i, j};
    }
}
