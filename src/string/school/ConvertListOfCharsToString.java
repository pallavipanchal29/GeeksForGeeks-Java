package string.school;

public class ConvertListOfCharsToString {
    public static void main(String[] args) {

    }

    public static String chartostr(char[] arr, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb.append(arr[i]);
        return sb.toString();
    }

}
