package stack.medium;

import java.util.Stack;

public class ExpressionContainsRedundantBrackets {
    public static void main(String[] args) {
        System.out.println(checkRedundancy("(b+c-d+(c))") == 1 ? "Yes" : "No");
    }

    public static int checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (st.empty()) return 0;
                    if (st.peek() == '(') return 1;
                    int count = 0;
                    while (st.peek() != '(') {
                        st.pop();
                        count++;
                    }
                    if (count < 2)
                        return 1;
                    st.pop();
                    break;
                default:
                    st.push(s.charAt(i));
                    break;
            }
        }
        return 0;
    }
}
