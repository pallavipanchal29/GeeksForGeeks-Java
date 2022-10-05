package string.school;

public class JavaStringsSet1 {
    public static void main(String[] args) {
        System.out.println(conRevstr("Geeks", "forGeeks"));
    }

    static String conRevstr(String S1, String S2) {
        String con = S1.concat(S2);
        int i = 0;
        int j = con.length() - 1;
        char[] temp = con.toCharArray();

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
