package string.school;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revStr("GeeksforGeeks"));
    }

    static String revStr(String S) {
        int i = 0;
        int j = S.length() - 1;
        char[] temp = S.toCharArray();

        while (i < j) {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }
}
