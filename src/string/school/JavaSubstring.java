package string.school;

public class JavaSubstring {
    public static void main(String[] args) {
        System.out.println(javaSub("cdbkdub", 0, 5));
    }

    static String javaSub(String S, int L, int R) {
        StringBuilder sb = new StringBuilder();
        for (int i = L; i <= R; i++)
            sb.append(S.charAt(i));
        return sb.toString();
    }
}
