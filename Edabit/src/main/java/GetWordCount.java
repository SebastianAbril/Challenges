public class GetWordCount {

    public static int  wordCounter(String sentence){
        String[] arraySolution = sentence.split(" ");
        int contadorPalabras = 0;

        for(int i = 0; i < arraySolution.length; i++){
            contadorPalabras = contadorPalabras+1;

        }

        return contadorPalabras;
    }


    public static void main(String[] args) {

        String pruebaUno = "Just an example here move along";
        System.out.println("La solución al reto da un valor de "+wordCounter(pruebaUno));



    }
}
