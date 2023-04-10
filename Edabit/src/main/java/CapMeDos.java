public class CapMeDos {

    public static String[] capMeDos(String[] s) {



        for(int i = 0; i < s.length; i++){
            s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
        }

        return s;


    }






    public static void main(String[] args){

        String[] ginetteBaby = {"samuel", "MABELLE", "letitia", "meridith"};

        for(String name: capMeDos(ginetteBaby)){
            System.out.println(name);
        }
    }
}
