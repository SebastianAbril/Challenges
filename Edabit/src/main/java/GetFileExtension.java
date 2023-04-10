

public class GetFileExtension {
    public static String[] getExtension(String[] arr) {
        String[] solution = new String[arr.length];
        for(int i=0; i < arr.length; i++){
            String[] fragments = arr[i].split("\\.");
            solution[i] = fragments[1];
        }
        return solution;
    }

    public static void main (String[] Args){

        String[] prueba = {"code.html", "code.css"};

        for(String format: getExtension(prueba)){
            System.out.println("Resultado: "+format);
        }
    }

}


/*
* Metodo substring
* Metodo indexOf
* metodo split()
* */