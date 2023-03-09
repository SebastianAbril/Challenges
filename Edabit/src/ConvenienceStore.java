public class ConvenienceStore {
/*
* A penny is worth 1 cent.
A nickel is worth 5 cents.
A dime is worth 10 cents.
A quarter is worth 25 cents.
*
* To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true,
* since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50
* */

    public static boolean changeEnough(int[] change, double amountDue) {
        double result = 0;

        double quarters = (double) (change[0]) / 4;
        double dimes = (double) (change[1]) / 10;
        double nickels = (double) (change[2]) / 20;
        double pennies = (double) (change[3]) / 100;

        result = quarters + dimes + nickels + pennies;

        if (result >= amountDue) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {

    }
}
