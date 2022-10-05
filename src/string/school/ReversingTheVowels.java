package string.school;

public class ReversingTheVowels {
    public static void main(String[] args) {
        System.out.println(modify("practice"));
    }

    static String modify(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] temp = s.toCharArray();

        while (i < j) {
            while (i < j && !isVowel(temp[i])) i++;
            while (i < j && !isVowel(temp[j])) j--;
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".contains(String.valueOf(ch));
    }
}
