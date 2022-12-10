package string.basic;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strstr("ababaaaaaa", "abaa"));
    }

    //Function to locate the occurrence of the string x in the string s.
    static int strstrBruteForce(String X, String Y) {
        // if `X` is null or if X's length is less than that of Y's
        if (X == null || Y.length() > X.length()) {
            return -1;
        }

        // if `Y` is null or is empty
        if (Y == null || Y.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= X.length() - Y.length(); i++) {
            int j;
            for (j = 0; j < Y.length(); j++) {
                if (Y.charAt(j) != X.charAt(i + j)) {
                    break;
                }
            }

            if (j == Y.length()) {
                return i;
            }
        }

        return -1;
    }

    // Function to implement `strstr()` function using KMP algorithm
    public static int strstr(String X, String Y) {
        // base case 1: `Y` is null or empty
        if (Y == null || Y.length() == 0) {
            return 0;
        }

        // base case 2: `X` is null, or X's length is less than Y's
        if (X == null || Y.length() > X.length()) {
            return -1;
        }

        char[] chars = Y.toCharArray();

        // `next[i]` stores the index of the next best partial match
        int[] next = new int[Y.length() + 1];
        for (int i = 1; i < Y.length(); i++) {
            int j = next[i + 1];

            while (j > 0 && chars[j] != chars[i]) {
                j = next[j];
            }

            if (j > 0 || chars[j] == chars[i]) {
                next[i + 1] = j + 1;
            }
        }

        for (int i = 0, j = 0; i < X.length(); i++) {
            if (j < Y.length() && X.charAt(i) == Y.charAt(j)) {
                if (++j == Y.length()) {
                    return (i - j + 1);
                }
            } else if (j > 0) {
                j = next[j];
                i--;    // as `i` will be incremented in the next iteration
            }
        }

        return -1;
    }
}
