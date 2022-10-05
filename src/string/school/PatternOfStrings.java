package string.school;

import java.util.ArrayList;

public class PatternOfStrings {
    public static void main(String[] args) {
        ArrayList<String> ans = pattern("GeeK");

        for (String s : ans)
            System.out.println(s);

    }

    static ArrayList<String> pattern(String S) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < S.length() - i; j++)
                sb.append(S.charAt(j));
            ans.add(sb.toString());
        }
        return ans;
    }
}
