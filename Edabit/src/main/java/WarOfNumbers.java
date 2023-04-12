public class WarOfNumbers {
    public static int warOfNumbers(int[]numbers){
        int sumOfOdd = 0;
        int sumOfEven =0;

        for(int number: numbers){
            if(number%2 == 0){
                sumOfEven += number;
            } else {
                sumOfOdd += number;
            }
        }
        return Math.abs(sumOfOdd - sumOfEven);
    }

}
