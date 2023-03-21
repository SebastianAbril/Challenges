import java.util.ArrayList;

public class FourLetterString {
    public static String[] isFourLetters(String[] s) {

        ArrayList<String> solutionList = new ArrayList<String>();
        for(String word: s){
            if(word.length() == 4){
                solutionList.add(word);
            }
        }
        return solutionList.toArray(new String[solutionList.size()]);
    }

    public static void main(String[] args) {

        String[] arrayPrueba = {"Tomato", "Potato", "Pair"};
        for(String word: isFourLetters(arrayPrueba)){
            System.out.println(word);
        }
    }
}
