package recursion.school;

public class PrintNto1 {
    public static void main(String[] args) {
        printNos(10);
    }

    public static void printNos(int N) {
        if (N <= 0) {
            return;
        } else {
            System.out.print(N + " ");
            printNos(N - 1);
        }
    }
}
