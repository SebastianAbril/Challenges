import java.util.Arrays;

public class TrimmedAverages {

    public static int trimmedAverages(int[] arr) {
        Arrays.sort(arr);
        float sum = 0.0f;
        for(int i=1; i< arr.length-1; i++){
            sum += arr[i];
        }
        return Math.round(sum/(arr.length-2));
    }

    public static void main(String[] args) {
        int[] arrayPrueba = {4,5,7,100};
        int[] arrayPrueba2 = {5,4,54,4,6,46,56};
        System.out.println(trimmedAverages(arrayPrueba));
        System.out.println(trimmedAverages(arrayPrueba2));
    }
}
