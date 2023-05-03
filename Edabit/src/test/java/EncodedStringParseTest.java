import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EncodedStringParseTest {

    @Test
    public void shouldParseCode(){
        String stringPruebaUno = "Tesha000Deep00014344";
        Map<String,String> solucionUno = new HashMap<>();
        solucionUno.put("firstName","Tesha");
        solucionUno.put("lastName","Deep");
        solucionUno.put("id","14344");

        Map<String,String> resultadoComparar  = EncodedStringParse.parseCode(stringPruebaUno);

        Assertions.assertEquals(resultadoComparar,resultadoComparar);
    }

}