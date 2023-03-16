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
        int[] arrayPrueba =  {1, 2, 3, 4};
        int[] arrayPrueba2 =  {2,4};
        System.out.println(isAvgWhole(arrayPrueba));
        System.out.println(isAvgWhole(arrayPrueba2));
    }
}
