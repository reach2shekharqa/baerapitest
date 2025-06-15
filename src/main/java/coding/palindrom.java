package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class palindrom {

    public static void main(String[] args) {
        String str = "civic";

        String newStr= str.toLowerCase().replaceAll("[\\W_]", "");

        List<Character> list = new ArrayList<>();

        for (char c : newStr.toCharArray()) {

            list.add(c);
        }

        List<Character> original = new ArrayList<>(list);

        Collections.reverse(list);

        if(original.equals(list)){

            System.out.println("palindroe");
        }else{
            System.out.println("not a plaindrome");
        }

       

    }

}
