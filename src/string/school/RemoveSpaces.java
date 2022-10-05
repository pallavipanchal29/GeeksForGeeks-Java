package string.school;

public class RemoveSpaces {
    public static void main(String[] args) {
        System.out.println(modify("    g f g"));
    }

    static String modify(String S) {
        return S.replaceAll(" ", "");
    }
}
