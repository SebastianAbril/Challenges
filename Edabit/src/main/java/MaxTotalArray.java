import java.util.Arrays;

public class MaxTotalArray {
    static int[] arrayPrueba = {1, 1, 0, 1, 3, 10, 10, 10, 10, 1};

    public static int maxTotalFiveNumbers(int[] array){
        Arrays.sort(array);
        int result=0;

        for(int i = array.length-1; i >= 5 ;i--){
            result += array[i];
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(maxTotalFiveNumbers(arrayPrueba));

    }
}
