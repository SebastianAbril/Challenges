import java.util.Arrays;

public class AlphabetSoup {
    public static String AlphabetSoup(String s) {
        char[] arrayChar = s.toCharArray();
        String solution = "";

        Arrays.sort(arrayChar);
        for(char letter: arrayChar){
            solution += letter;
        }
        return solution;
    }
}
