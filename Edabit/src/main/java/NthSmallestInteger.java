import java.util.Arrays;

public class NthSmallestInteger {
    public static int nthSmallest(int[] arr, int n) {
        if( n> arr.length){
            return -1;
        }
        Arrays.sort(arr);
        int nthSmallest = arr[n-1];
        return nthSmallest;
    }

    public static void main(String[] args) {
        int[] arrayPrueba = {1, 3, 5, 7};
        System.out.println(nthSmallest(arrayPrueba,1));
    }
}
