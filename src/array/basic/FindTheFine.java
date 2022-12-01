package array.basic;

public class FindTheFine {
    public static void main(String[] args) {
        long[] car = {2375, 7682, 2325, 2352};
        long[] fine = {250, 500, 350, 200};
        System.out.println(totalFine(4, 12, car, fine));
    }

    public static long totalFine(long n, long date, long[] car, long[] fine) {
        long ans = 0;
        boolean isEven = date % 2 == 0;
        for (int i = 0; i < car.length; i++) {
            if (isEven) {
                if (car[i] % 2 == 1)
                    ans = ans + fine[i];
            } else {
                if (car[i] % 2 == 0)
                    ans = ans + fine[i];
            }
        }
        return ans;
    }
}
