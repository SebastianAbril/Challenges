import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixTheSpacingTest {

    @Test
    public void shouldFixTheSpacing(){
        //given

        String pruebaUno = "The film   starts       at      midnight. ";
        String solucionUno = "The film starts at midnight.";
        //when
        String pruebaUnoResultado = FixTheSpacing.correctSpacing(pruebaUno);

        //then

        assertEquals(pruebaUnoResultado, solucionUno);

    }

}