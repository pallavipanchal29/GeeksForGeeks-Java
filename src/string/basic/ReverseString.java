package string.basic;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWord("Geeks"));
    }

    public static String reverseWord(String str) {
        char[] temp = str.toCharArray();
        int i = 0;
        int j = temp.length - 1;

        while (i < j) {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }
}
