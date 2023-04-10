import java.util.ArrayList;

public class FindEvenNums {
    public static int[] findEvenNums(int num) {

        int aux;
        int[] result;


        if(num ==0 || num ==1){
            aux = 0;
            result = new int[aux];
            return result;
        } else if( num%2 != 0){
            aux = (num-1)/2;
            result = new int[aux];
        } else {
            aux = num/2;
            result = new int[aux];
        }

        int counter = 2;

        for(int i=0; i<result.length;i++){
                result[i] = counter;
                counter +=2;

        }

        return result;

    }

    public static void main(String[] Args){
        for(int number: findEvenNums(8) ){
            System.out.println(number);
        }
        ;
    }



    /*
    public static ArrayList<Integer> findEvenNums(int number){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=2; i<= number;i+=2){
            result.add(i);
        }

        return result;

    }

    public static void main(String[] args){
        for(Integer number: findEvenNums(9)){
            System.out.println(number);
        }

    }

    */
}


