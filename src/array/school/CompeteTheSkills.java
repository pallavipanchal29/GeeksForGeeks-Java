package array.school;

public class CompeteTheSkills {
    static long ca = 0, cb = 0;

    public static void main(String[] args) {
        long[] a = {1804289384, 846930887, 1681692778};
        long[] b = {1714636916, 1957747794, 424238336};
        scores(a, b);

        System.out.println(ca + " " + cb);

    }

    public static void scores(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i])
                ca++;
            else if (b[i] > a[i])
                cb++;
        }
    }
}
