package string.school;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        System.out.println(removeVowels("welcome to geeksforgeeks"));
    }

    static String removeVowels(String S) {
        return S.replaceAll("[aeiouAEIOU]", "");
    }

}
