package array.school;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(average(arr, arr.length));
    }

    static String average(int[] A, int N) {
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < N; i++)
            sum = sum + A[i];

        avg = (double) sum / N;
        return sum + " " + String.format("%.2f", avg);
    }
}
