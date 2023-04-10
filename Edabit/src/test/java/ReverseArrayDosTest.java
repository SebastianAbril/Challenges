
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayDosTest {

    @Test
    public void shouldReverseAnArray(){
        //given
        int[] arrayPrueba = {1,2,3,4,5};
        int[] expectedResult = {5,4,3,2,1};

        //when
        int [] result = ReverseArrayDos.reverse(arrayPrueba);

        //then
        assertArrayEquals(result, expectedResult);
    }

    @Test
    public void shouldReverseAnEmptyArray(){
        //given
        int[] arrayPrueba = {};
        int[] expectedResult = {};

        //when
        int [] result = ReverseArrayDos.reverse(arrayPrueba);

        //then
        assertArrayEquals(result, expectedResult);
    }
}