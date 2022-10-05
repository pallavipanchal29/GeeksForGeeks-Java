package string.school;

public class RemoveCharsAlphanumericString {
    public static void main(String[] args) {
        System.out.println(removeCharacters("AA1d23cBB4"));
    }

    static String removeCharacters(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i)))
                sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}
