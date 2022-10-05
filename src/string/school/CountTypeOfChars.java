package string.school;

public class CountTypeOfChars {
    public static void main(String[] args) {
        int[] ans = count("#GeeKs01fOr@gEEks07");
        for (int i : ans)
            System.out.println(i);
    }

    static int[] count(String s) {
        int lower = 0;
        int upper = 0;
        int numbers = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) upper++;
            else if (Character.isLowerCase(s.charAt(i))) lower++;
            else if (Character.isDigit(s.charAt(i))) numbers++;
            else
                special++;
        }
        return new int[]{upper, lower, numbers, special};
    }
}
