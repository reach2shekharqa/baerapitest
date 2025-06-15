package coding;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String input1 = "rat";
        String input2 = "car";

        if (input1.length() == input2.length()) {

            char[] a = input1.toCharArray();
            char[] b = input2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("anagram!!");
            } else {
                System.out.println("as char are different therfore no anagram!!");

            }

        } else {

            System.out.println("as length are not equal therfore no anagram!!");
        }

    }

}
