public class RepeatString {
    public static String doubleChar(String s) {
        String repeatedString = "";
       for(int i=0; i < s.length();i++){
           char letter = s.charAt(i);
           repeatedString += String.valueOf(letter)+String.valueOf(letter);

       }

       return repeatedString;
    }
    public static void main(String[] Args){
        System.out.println(doubleChar("pepesitox"));
    }
}
