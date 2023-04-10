public class HowManyDecimalPlaces {

    public static int getDecimalPlaces(String num) {
        String[] arrayOfWords = num.split("[.]");
        if( arrayOfWords.length == 1){
            return 0;
        } else {
            int decimalPlaces = arrayOfWords[1].length();

            return decimalPlaces;
        }

    }

    public static void main(String[] args) {

        String num1 = "43.20";
        String num2 = "400";
        String num3 = "3.1";

        System.out.println(getDecimalPlaces(num1));
        System.out.println(getDecimalPlaces(num2));
        System.out.println(getDecimalPlaces(num3));
    }

}
