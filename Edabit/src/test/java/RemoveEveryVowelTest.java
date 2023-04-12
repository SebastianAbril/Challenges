import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RemoveEveryVowelTest {
    //given
    @Test
    public void shouldRemoveVowels(){
        String pruebaUno = "I have never seen a thin person drinking Diet Coke.";

        //when
        String resultadoUno = RemoveEveryVowel.removeVowels(pruebaUno);
        //then
        String solucionUno =  " hv nvr sn  thn prsn drnkng Dt Ck.";

        assertEquals(resultadoUno,solucionUno);

    }

}