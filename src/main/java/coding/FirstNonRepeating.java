package coding;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String input = "swiss";

        // HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);

            boolean isUnqiue = true;

            for (int j = 0; j < input.length(); j++) {

                if (i != j && input.charAt(j) == current) {

                    isUnqiue = false;
                    break;

                }
            }

            if (isUnqiue) {
                System.out.println("1st non-reating   :" + current);
                return;
            }

            // System.out.println("not found !!!");
        }

    }

}
