public class StringOrInteger {

    public static String intOrString(Object var) {
        if(var instanceof String){
            return "str";
        } else {
            return "int";
        }
    }

    public static void main(String[] args){

    }
}
