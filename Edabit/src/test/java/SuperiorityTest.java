import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperiorityTest {

    @Test
    public void shouldSuperiorityTest(){
        //given

        Object[] arrayPruebaUno = {1,2,4};
        Object[] arrayPruebaDos = {1,2,3};

        //when
        boolean resultUno = Superiority.isFirstSuperior(arrayPruebaUno, arrayPruebaDos);

        //then
        assertEquals(resultUno, true);
    }

}