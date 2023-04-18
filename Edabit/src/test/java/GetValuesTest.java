import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GetValuesTest {
    @Test
    public void shouldGetValuesTest(){

        //given
        HashMap<String,String> pruebaUno = new HashMap<String,String>() {
            {
                put("a", "1");
                put("b", "2");
                put("c", "3");
            }};
        String[] solucionUno = {"1", "2", "3"};

        //when
        String[] resultadoUno = GetValues.getValues(pruebaUno);


        //then

        assertArrayEquals(resultadoUno, solucionUno );

    }

}