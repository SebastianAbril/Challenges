import java.util.Arrays;

public class IncrementToTop {

    public static int incrementToTop(int[] arr) {
        int steps = 0;
        Arrays.sort(arr);
        int maximum = arr[arr.length-1];
        for(int number: arr){
            steps += maximum - number;
        }

        return steps;
    }


    public static void main(String[] args) {
        int[] arrayPrueba = {3,4,5};
        System.out.println(incrementToTop(arrayPrueba));
    }
}
