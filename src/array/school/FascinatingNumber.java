package array.school;

import java.util.HashMap;

public class FascinatingNumber {
    public static void main(String[] args) {
        System.out.println(fascinating(267));
    }

    static boolean fascinating(long n) {
        if (String.valueOf(n).length() < 3) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(n * 2);
        sb.append(n * 3);

        String num = sb.toString();
        if (num.length() != 9) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int t = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (t != 0)
                map.put(t, map.getOrDefault(t, 0) + 1);
        }
        return map.size() >= 9;
    }
}
