public class CapMe {
    public static String[] capMe(String[] s) {

       String[] newArray = new String [s.length];

        for(int i =0; i<s.length;i++){
            String capitalizedFirstLetter = s[i].substring(0,1).toUpperCase();
            String remainingNameLetters = s[i].substring(1).toLowerCase();
            String capitalizedName = capitalizedFirstLetter + remainingNameLetters;
            newArray[i] = capitalizedName;
        }
    return newArray;
    }


    public static void main(String[] args){

        String[] ginetteBaby = {"samuel", "MABELLE", "letitia", "meridith"};

        for(String name: capMe(ginetteBaby)){
            System.out.println(name);
        }
    }

}

/*
*
*  - Java debe tener un metodo para capitalizar
*
*  - Buscar el metodo toUpperCase();
* */
