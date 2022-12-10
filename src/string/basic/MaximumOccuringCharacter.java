package string.basic;

import java.util.*;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("testsample"));
    }

    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++)
            map.put(line.charAt(i), map.getOrDefault(line.charAt(i), 0) + 1);

        List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (o1.getValue() == o2.getValue())
                    return o1.getKey().compareTo(o2.getKey());
                else
                    return o2.getValue().compareTo(o1.getValue());
            }
        });
        return list.get(0).getKey();
    }
}
