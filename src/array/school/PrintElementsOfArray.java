package array.school;

public class PrintElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr, arr.length);
    }

    //Just print the space seperated array elements
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
