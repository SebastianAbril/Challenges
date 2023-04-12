import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarOfNumbersTest {
    @Test
    public void shouldWarOfNumber (){

        //given
        int[] arrayPrueba1 = {2, 8, 7, 5};
        int[] arrayPrueba2 = {12, 90, 75};
        int[] arrayPrueba3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};

        //when
        int resultado1 = WarOfNumbers.warOfNumbers(arrayPrueba1);
        int resultado2 = WarOfNumbers.warOfNumbers(arrayPrueba2);
        int resultado3 = WarOfNumbers.warOfNumbers(arrayPrueba3);


        //there
        int resultadoEsperado1 = 2;
        int resultadoEsperado2 = 27;
        int resultadoEsperado3 = 168;

        Assertions.assertEquals(resultado1, resultadoEsperado1);
        Assertions.assertEquals(resultado2, resultadoEsperado2);
        Assertions.assertEquals(resultado3, resultadoEsperado3);
    }



}