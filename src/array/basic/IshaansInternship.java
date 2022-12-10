package array.basic;

public class IshaansInternship {
    int getCandidate(int n, int k) {
        int r = 1;
        while (r < n) {
            if (r * k > n) {
                break;
            }
            r = r * k;
        }
        return r;
    }
}
