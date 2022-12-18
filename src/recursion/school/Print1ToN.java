package recursion.school;

public class Print1ToN {
    public static void main(String[] args) {
        printNos(10);
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");
    }

    public static void printNos(int N) {
        if (N == 1)
            return;
        else
            printNos(N - 1);
    }
}
