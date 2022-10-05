package string.school;

public class DisplayLongestName {
    public static void main(String[] args) {
        String[] names = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(names, names.length));
    }

    static String longest(String[] names, int n) {
        int max = Integer.MIN_VALUE;
        String ans = " ";

        for (int i = 0; i < n; i++) {
            if (names[i].length() > max) {
                max = names[i].length();
                ans = names[i];
            }
        }
        return ans;
    }
}

