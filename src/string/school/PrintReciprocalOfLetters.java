package string.school;

public class PrintReciprocalOfLetters {
    public static void main(String[] args) {
        System.out.println(reciprocalString("ab C"));
    }

    static String reciprocalString(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLowerCase(S.charAt(i))) {
                sb.append((char) (122 - (S.charAt(i) - 'a')));
            } else if (Character.isUpperCase(S.charAt(i))) {
                sb.append((char) (90 - (S.charAt(i) - 'A')));
            } else sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}
