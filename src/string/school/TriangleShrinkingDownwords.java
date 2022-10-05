package string.school;

public class TriangleShrinkingDownwords {
    public static void main(String[] args) {
        System.out.println(triDownwards("IOP"));
    }

    static String triDownwards(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) // horizontal line
        {
            int j = i;
            int k = 0;
            while (k < j)  // printing dots
            {
                sb.append(".");
                k++;
            }
            while (j < S.length()) {
                sb.append(S.charAt(j));
                j++;
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
