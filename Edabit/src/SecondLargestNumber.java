import java.util.Arrays;

public class SecondLargestNumber {
    public static int secondLargest(int[] array){
      Arrays.sort(array);
      int result = array[array.length-2];
      return result;
    }
}
