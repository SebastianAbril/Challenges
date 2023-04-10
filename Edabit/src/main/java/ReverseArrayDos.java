import java.util.stream.IntStream;

public class ReverseArrayDos {

    public static int[] reverse(int[] array) {
       // int[] result = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        int[] result = IntStream.rangeClosed(1,array.length).map(i-> array[array.length-i]).toArray();
        return result;
    }
}
