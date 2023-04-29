import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSoupTest {

    @Test
    public void shouldAlphabetSoupTest(){
        String pruebaUno = "hello";
        String solucionUno = "ehllo";

        String resultadoUno = AlphabetSoup.AlphabetSoup(pruebaUno);

        Assertions.assertEquals(resultadoUno,solucionUno);
    }

}