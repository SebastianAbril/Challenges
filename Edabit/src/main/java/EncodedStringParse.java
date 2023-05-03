import java.util.HashMap;
import java.util.Map;

public class EncodedStringParse {
    public static Map<String, String> parseCode(String s) {
        String[] splitedString = s.split("0+");
        Map<String,String> solution = new HashMap<>();

        solution.put("firstName", splitedString[0]);
        solution.put("lastName", splitedString[1]);
        solution.put("id", splitedString[2]);

        return  solution;

    }

}
