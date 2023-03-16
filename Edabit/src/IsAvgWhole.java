public class IsAvgWhole {
    public static boolean isAvgWhole(int[] arr) {
        double average = 0;
        for(int i=0; i< arr.length; i++){
            average += arr[i];
        }
        average = average/arr.length;

        if( average == (int) average){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Double pepe = 2.5;

        int[] arrayPrueba =  {1, 2, 3, 4};
        int[] arrayPrueba2 =  {2,4};
        System.out.println(isAvgWhole(arrayPrueba));
        System.out.println(isAvgWhole(arrayPrueba2));

        Double pepito = 2.5;
        Double pepita = 2.5;

        if(pepito == pepita ){
            System.out.println("trueeee");
        } else {
            System.out.println("falseee");
        }

        Double juan = 3.5;

        Integer sebas = juan.intValue();
        System.out.println(sebas);

    }
}
