import java.util.Arrays;

public class SortNumsAscending {
    static int[] arrayPrueba = {1, 1, 0, 1, 3, 10, 10, 10, 10, 1};
    public static int[] sortNumsAscending(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args){
        System.out.println(sortNumsAscending(arrayPrueba));
    }
}
