import java.util.ArrayList;

public class FilterByDigitLength {
    public static int[] filterByLength(int[] numbers, int length) {

        ArrayList<Integer> arrayListSolution = new ArrayList<Integer>();

        for(int number: numbers){
            if(String.valueOf(number).length() == length){
                arrayListSolution.add(number);
            }
        }
        int[] solution = new int[arrayListSolution.size()];
        for(int i=0;i<solution.length;i++){
            solution[i] = arrayListSolution.get(i);
        }

        return solution;
    }

    public static void main(String[] args) {

        int[] arrayPrueba = {12, 2000, 13, 1979, 12, 17};

        for(int number: filterByLength(arrayPrueba,2)){
            System.out.println(number);
        }

    }


}
