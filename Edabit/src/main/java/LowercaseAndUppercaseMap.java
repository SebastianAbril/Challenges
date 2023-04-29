import java.util.*;

public class LowercaseAndUppercaseMap {
    public static Map<String, String> mapping(String[] letters) {
        Map<String,String> solution = new HashMap<>();
        for(String letter: letters){
            solution.put(letter, letter.toUpperCase());
        }

        return solution;
    }
}
