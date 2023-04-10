import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyDecimalPlacesTest {

    @Test
    public void shoulHowManyDecimalPlaces (){

        //given
        String number1 = "43.20";
        String number2 = "400";
        String number3 = "3.1";

        //when
        int resultado1 = HowManyDecimalPlaces.getDecimalPlaces(number1);
        int resultado2 = HowManyDecimalPlaces.getDecimalPlaces(number2);
        int resultado3 = HowManyDecimalPlaces.getDecimalPlaces(number3);


        //then
        Assertions.assertEquals(resultado1, 2);
        Assertions.assertEquals(resultado2, 0);
        Assertions.assertEquals(resultado3, 1);




    }
}