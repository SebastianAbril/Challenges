public class GreaterThanOne {
    public static boolean greaterThanOne(String frac) {
    String[] numbers = frac.split("/");
    double numerador = Double.valueOf(numbers[0]);
    double denominador = Double.valueOf(numbers[1]);

    double decimalValue = (double) (numerador / denominador);
        System.out.println("decimalValue= "+decimalValue);
    if( decimalValue > 1){
        return true;
    } else {
        return false;
    }
    }

    public static void main (String[] args){
        System.out.println(greaterThanOne("7/4"));

    }
}
