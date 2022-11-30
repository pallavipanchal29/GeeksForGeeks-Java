package array.basic;

import java.util.Scanner;

public class OperatingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ind = 0;
        while (n > 0) {
            arr[ind++] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(searchEle(arr, x));

        int y = sc.nextInt();
        int yi = sc.nextInt();
        System.out.println(insertEle(arr, y, yi));

        int z = sc.nextInt();
        System.out.println(deleteEle(arr, z));
    }

    public static boolean searchEle(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        return false;
    }

    public static boolean insertEle(int[] a, int y, int yi) {
        // add code here.
        int i;
        for (i = 0; a[i] != -1; i++) ;
        if (yi >= i) return false;
        a[yi] = y;
        return true;
    }

    public static boolean deleteEle(int[] a, int z) {
        // add code here.
        int i, index = 0;
        for (i = 0; a[i] != -1; i++) {
            if (a[i] == z) index = i;
        }
        for (int j = index; j < i; j++) {
            a[j] = a[j + 1];
        }
        return true;
    }
}
