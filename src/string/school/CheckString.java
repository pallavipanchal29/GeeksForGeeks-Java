package string.school;

public class CheckString {
    public static void main(String[] args) {
        System.out.println(check("geeks"));
    }

    static Boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
}
