package string.school;

import java.util.ArrayList;

public class ExtractTheIntegers {
    public static void main(String[] args) {
        ArrayList<String> ans = extractIntegerWords("B>03");

        for (String s : ans)
            System.out.print(s + " ");
    }

    static ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> ans = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp = temp + s.charAt(i);
            } else {
                if (temp != "") {
                    ans.add(temp);
                    temp = "";
                }
            }
        }

        if (temp != "") {
            ans.add(temp);
        }
        return ans;
    }
}
