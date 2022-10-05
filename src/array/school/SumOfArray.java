package array.school;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr, arr.length));
    }

    static int sum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + arr[i];
        return sum;
    }
}
