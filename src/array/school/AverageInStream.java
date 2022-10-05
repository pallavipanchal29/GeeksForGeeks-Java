package array.school;

public class AverageInStream {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        float[] ans = streamAvg(arr, arr.length);

        for (float i : ans)
            System.out.print(i + " ");

    }

    static float[] streamAvg(int[] arr, int n) {
        float sum = 0f;
        int count = 1;
        float[] ans = new float[n];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            ans[i] = sum / count;
            count++;
        }
        return ans;
    }
}
