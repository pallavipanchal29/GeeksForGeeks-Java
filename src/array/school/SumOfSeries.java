package array.school;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(46341));
    }

    // function to return sum of  1, 2, ... n
    static long seriesSum(int n) {
        long sum = 0L;
        sum = ((long) n * (n + 1)) / 2;
        return sum;
    }
}
