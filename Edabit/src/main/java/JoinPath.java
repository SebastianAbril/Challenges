public class JoinPath {

    public static String joinPath(String portion1, String portion2) {

        char lastCharPortion1 = portion1.charAt(portion1.length()-1);
        char firstCharPortion2 = portion2.charAt(0);

        if(lastCharPortion1 != '/' && firstCharPortion2 != '/'  ){
            portion1 = portion1 + "/";
            return portion1+portion2;
        } else if ( lastCharPortion1 == '/' && firstCharPortion2 != '/' ){
            return portion1+portion2;
        } else if (lastCharPortion1 != '/' && firstCharPortion2 == '/'){
            return portion1+portion2;
        } else {
            portion2 = portion2.substring(1);
            return portion1+portion2;
        }
    }

    public static void main(String[] args){

        System.out.println(joinPath("hola","sebas"));
        System.out.println(joinPath("hola/","sebas"));
        System.out.println(joinPath("hola","/sebas"));
        System.out.println(joinPath("hola/","/sebas"));

    }
}
