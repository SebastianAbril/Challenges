import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseAndUppercaseMapTest {

    @Test
    public void shouldLowerfcaseAndUppercaseMap(){
        //given
        String[] pruebaUno = {"x", "a", "v", "i", "e", "r"};
        Map<String, String> solucionUno = new HashMap<>();
        solucionUno.put("x","X");
        solucionUno.put("a","A");
        solucionUno.put("v","V");
        solucionUno.put("i","I");
        solucionUno.put("e","E");
        solucionUno.put("r","R");
        //when
        Map<String, String> resultadoUno = LowercaseAndUppercaseMap.mapping(pruebaUno);

        //then

        Assertions.assertEquals(resultadoUno, solucionUno);

    }

}