import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfMultiplesTest {

    @Test
    public void shouldArrayOfMultiplesTest(){

        //given
        int numPrueba1 = 7;
        int lengthPrueba1 = 5;

        // when
        int[] resultadoPrueba1 = ArrayOfMultiples.arrayOfMultiples(numPrueba1, lengthPrueba1);

        //then
        int[] comparador1 = {7, 14, 21, 28, 35};
        assertArrayEquals(resultadoPrueba1, comparador1 );

    }

}