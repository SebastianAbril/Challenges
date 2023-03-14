public class SpacesBetweenEachCharacter {

    public static String spaceMeOut(String str){
        String result = "";

        for(int i= 0; i <str.length(); i++){
            if( i == str.length()-1){
                result += str.charAt(i);
            } else {
                result += str.charAt(i)+ " ";
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(spaceMeOut("Sebastian"));
    }
}
