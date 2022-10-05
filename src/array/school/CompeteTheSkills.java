package array.school;

public class CompeteTheSkills {
    static long ca = 0, cb = 0;

    public static void main(String[] args) {
        long[] a = {4, 2, 7};
        long[] b = {5, 6, 3};
        scores(a, b);

        System.out.println(ca + " " + cb);

    }

    public static void scores(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) continue;
            else if (a[i] > b[i]) ca++;
            else cb++;
        }
    }
}
