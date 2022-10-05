package string.school;

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static void main(String[] args) {
        List<String> list = splitString("abcdef");
        for (String s : list)
            System.out.println(s);
    }

    static List<String> splitString(String S) {
        List<String> list = new ArrayList<>();
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i)))
                letters.append(S.charAt(i));
            else if (Character.isDigit(S.charAt(i)))
                numbers.append(S.charAt(i));
            else
                special.append(S.charAt(i));
        }

        list.add(letters.toString().length() == 0 ? "-1" : String.valueOf(letters));
        list.add(numbers.toString().length() == 0 ? "-1" : String.valueOf(numbers));
        list.add(special.toString().length() == 0 ? "-1" : String.valueOf(special));

        return list;
    }
}
