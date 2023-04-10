import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSpecialCharactersTest {
    @Test
    public void shouldRemoveSpecialCharacters(){

        //given
        String stringPrueba1 = "The quick brown fox!";
        String stringPrueba2 = "%fd76$fd(-)6GvKlO.";
        String stringPrueba3 = "D0n$c sed 0di0 du1";

        //when
       String resultado1 = RemoveSpecialCharacters.removeSpecialCharacters(stringPrueba1);
       String resultado2 = RemoveSpecialCharacters.removeSpecialCharacters(stringPrueba2);
       String resultado3 = RemoveSpecialCharacters.removeSpecialCharacters(stringPrueba3);

        //then
        assertEquals(resultado1, "The quick brown fox");
        assertEquals(resultado2, "fd76fd-6GvKlO");
        assertEquals(resultado3, "D0nc sed 0di0 du1");



    }
}