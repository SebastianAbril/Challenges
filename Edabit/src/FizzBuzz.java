public class FizzBuzz {
    public static void main (String Args []){
        System.out.println("Fizzbuzz de 5 es: "+ fizzBuzzNumber(5));

    }

    public static String fizzBuzzNumber(int number){
        if(number%3 == 0 && number%5 == 0){
            return "FizzBuzz";
        } else if( number%3 == 0){
            return "Fizz";
        } else if (number%5 == 0){
            return "Buzz";
        } else {
            return String.valueOf(number);
        }

    }
}
