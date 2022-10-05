package array.school;

public class PerfectArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(IsPerfect(arr, arr.length));
    }

    public static boolean IsPerfect(int[] a, int n) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
