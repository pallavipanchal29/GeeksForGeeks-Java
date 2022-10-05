package string.school;

public class CheckForBinary {
    public static void main(String[] args) {
        System.out.println(isBinary("101"));
    }

    static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1')
                return false;
        }
        return true;
    }
}
