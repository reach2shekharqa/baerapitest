package coding;

import java.util.HashMap;

public class CounTChar {

    public static void main(String[] args) {
        
        String input= "aabcc";

        HashMap <Character,Integer> map = new HashMap<>();

        for(char c: input.toCharArray()){

            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }


        }

        System.out.println(map);
        
    }
    
}
