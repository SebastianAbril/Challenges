import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelReplacerTest {

    @Test
    public void shouldVowelReplacer(){

        //given
        String pruebaUnoText = "the aardvark";
        char pruebaUnoCaracter = '#';

        //when
        String resultadoPruebaUno = VowelReplacer.replaceVowels(pruebaUnoText,pruebaUnoCaracter);
        String solucionUno = "th# ##rdv#rk";
        //then

        assertEquals(resultadoPruebaUno,solucionUno);

    }

}