package array.medium;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rearrange(arr, arr.length);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void rearrange(long[] A, int N) {
        int max_idx = N - 1, min_idx = 0;
        int max_elem = (int) (A[N - 1] + 1);
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                A[i] += (A[max_idx] % max_elem) * max_elem;
                max_idx--;
            } else {
                A[i] += (A[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }
        for (int i = 0; i < N; i++)
            A[i] = A[i] / max_elem;
    }
}
