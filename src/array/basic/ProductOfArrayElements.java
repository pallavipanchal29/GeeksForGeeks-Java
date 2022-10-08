package array.basic;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 3L, 4L};
        System.out.println(product(arr, 4L, arr.length));
    }

    public static Long product(Long[] arr, Long mod, int n) {
        Long prod = 1L;
        for (int i = 0; i < n; i++)
            prod = (prod * arr[i]) % mod;
        return prod % mod;
    }
}
