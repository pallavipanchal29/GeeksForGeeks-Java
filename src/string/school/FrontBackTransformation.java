package string.school;

public class FrontBackTransformation {
    public static void main(String[] args) {
        System.out.println(convert("Hello"));
    }

    static String convert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                sb.append((char) (90 - (s.charAt(i) - 'A')));
            else if (Character.isLowerCase(s.charAt(i)))
                sb.append((char) (122 - (s.charAt(i) - 'a')));
        }
        return sb.toString();
    }
}
