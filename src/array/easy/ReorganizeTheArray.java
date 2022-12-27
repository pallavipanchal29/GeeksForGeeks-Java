package array.easy;

public class ReorganizeTheArray {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] ans = Rearrange(arr, arr.length);
        for (int i : ans)
            System.out.print(i + " ");
    }

    // Function for finding maximum and value pair
    public static int[] Rearrange(int[] arr, int n) {
        for (int i = 0; i < arr.length; ) {
            if (arr[i] >= 0 && arr[i] != i) {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            } else {
                i++;
            }
        }
        return arr;
    }

}
