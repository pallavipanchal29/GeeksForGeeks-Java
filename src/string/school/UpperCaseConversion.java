package string.school;

public class UpperCaseConversion {
    public static void main(String[] args) {
        System.out.println(transform("i love programming"));
    }

    public static String transform(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (j == 0)
                    sb.append(String.valueOf(word.charAt(j)).toUpperCase());
                else
                    sb.append(word.charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
