package array.basic;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        System.out.println(convertfive(1005));
    }

    static int convertfive(int num) {
        char[] number = String.valueOf(num).toCharArray();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == '0')
                number[i] = '5';
        }
        return Integer.parseInt(String.valueOf(number));
    }
}
