import java.util.Scanner;

public class EjercicioSnaky {

    public  void resolverEjercicio(){
         Scanner scan = new Scanner(System.in);
         String a = scan.nextLine();

         if(isDouble(a)){
             System.out.println("El valor de "+ a + " Es Double");
         } else if (isInteger(a)){
             System.out.println("El valor de "+ a + " Es Integer");
         } else {
             System.out.println("El valor de "+ a +" Es un String");
         }
    }

    public static boolean isDouble(String data){
        boolean response = false;
        if(data == null){
            return false;
        }
        try{
            double d = Double.parseDouble(data);
            if(d %1 != 0){
                response = true;
            }

        }catch (NumberFormatException nfe){
            return false;
        }
        return response;
    }

    public static boolean isInteger(String data){

        if(data == null){
            return false;
        }
        try{
            int i = Integer.parseInt(data);
        }catch (NumberFormatException nfe){
            return false;
        }

        return true;
    }
}
