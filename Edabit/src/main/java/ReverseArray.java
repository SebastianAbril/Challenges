import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {


    public static int[] reverse(int[] array) {
        for(int i=0; i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }


}
