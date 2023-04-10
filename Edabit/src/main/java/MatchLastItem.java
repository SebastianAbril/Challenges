public class MatchLastItem {

    static String[] arrayPrueba = {"i", "love", "tesh", "ilovetesh"};
    public static boolean matchLastItem(String[] t){
        String firstSentence = "";

        for(int i=0; i<t.length-1;i++){
            firstSentence += t[i];
        }
        System.out.println(firstSentence);

        if(firstSentence.equals(t[t.length-1])){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] Args){
        System.out.println(matchLastItem(arrayPrueba));
    }
}
