package coding;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstNonRepeating1 {

    public static void main(String[] args) {

        String input = "swiss";

        LinkedHashSet<Character> seenOnceChar = new LinkedHashSet<>();

        HashSet<Character> seenmultiple = new HashSet<>();

        for (char c : input.toCharArray()) {

            if (seenmultiple.contains(c)) {
                continue;

            } else if (seenOnceChar.contains(c)) {
                seenOnceChar.remove(c);
                seenmultiple.add(c);
            } else {
                seenOnceChar.add(c);
            }
        }
        if (!seenOnceChar.isEmpty()) {
            System.out.println("First non-repeating character: " + seenOnceChar.iterator().next());
        } else {
            System.out.println("No non-repeating character found.");
        }

    }

}
