package coding;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {

    public static void main(String[] args) {
        
        String input= "swiss";

        Set<Character> setOf = new HashSet<>();

        for(Character ch : input.toCharArray()){

            if(!setOf.contains(ch)){
                setOf.add(ch);
            }
            else{
                System.out.println("first repeating char is : "+ch);
                break;
            }
        }



    }
    
}
