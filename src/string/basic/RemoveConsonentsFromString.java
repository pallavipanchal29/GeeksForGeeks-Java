package string.basic;

public class RemoveConsonentsFromString {
    public static String removeConsonants(String s) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i))))
                sb.append(s.charAt(i));
        }
        return sb.toString().length() == 0 ? "No Vowel" : sb.toString();
    }
}
