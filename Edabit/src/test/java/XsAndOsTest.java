import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XsAndOsTest {
    @Test
    public void shouldXsAndOs(){
        //given

        String pruebaUno = "xXxffasOoO";

        //when

        boolean resultadoUno = XsAndOs.getXO(pruebaUno);
        boolean solucionUno = true;

        //then
        assertEquals(resultadoUno,solucionUno);
    }

}