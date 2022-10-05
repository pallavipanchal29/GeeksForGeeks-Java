package string.school;

public class CountCamelCaseChars {
    public static void main(String[] args) {
        System.out.println(countCamelCase("ckjkUUYII"));
    }

    static int countCamelCase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }
}
