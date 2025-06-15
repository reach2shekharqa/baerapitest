package coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "swiss";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println("first non repeating char is " + entry.getKey());
                break;
            }
        }

    }

}
