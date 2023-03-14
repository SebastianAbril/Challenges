import java.util.Arrays;

public class SmallestAndBiggest {

    static int[] arrayPrueba = {1, 2, 3, 4, 5};
    public static int[] maxMin(int[] array){
        Arrays.sort(array);
        int[] arrayResult = new int[2];
        arrayResult[0] = array[0];
        arrayResult[1] = array[array.length-1];
        return arrayResult;
    }

    public static void main(String[] args){
        System.out.println(maxMin(arrayPrueba));
        for(int number: maxMin(arrayPrueba)){
            System.out.println(number);
        }
    }
}
