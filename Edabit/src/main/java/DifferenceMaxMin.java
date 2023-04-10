import java.util.Arrays;

public class DifferenceMaxMin {
    public static int differenceMaxMin(int[] array){

        Arrays.sort(array);
        int result = array[array.length-1] - array[0];
        return result;
    }

    public static void main(String[] args){

    }
}
