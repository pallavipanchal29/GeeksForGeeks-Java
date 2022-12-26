package stack.easy;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));
    }

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            switch (x.charAt(i)) {
                case ')':
                    if (st.isEmpty() || st.peek() != '(') return false;
                    st.pop();
                    break;
                case '}':
                    if (st.isEmpty() || st.peek() != '{') return false;
                    st.pop();
                    break;
                case ']':
                    if (st.isEmpty() || st.peek() != '[') return false;
                    st.pop();
                    break;
                default:
                    st.push(x.charAt(i));
                    break;
            }
        }
        return st.size() == 0;
    }
}
