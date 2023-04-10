public class SpecialArrays {
    public static boolean isSpecialArray(int[] arr) {
        boolean solution=false;

        for(int i=0; i<arr.length;i+=2){
            if(arr[i]%2 ==0){
                solution = true;
            } else {
                return solution = false;

            }
        }

        for(int i=1; i<arr.length; i+=2){
            if(arr[i]%2 !=0){
                solution = true;
            } else {
                return solution = false;

            }
        }
        return solution;

    }

    public static void main(String[] args) {
        int[] arrayPrueba = {2, 7, 4, 9, 6, 1, 6, 3};
        int[] arrayPruebaDos = {2, 7, 9, 1, 6, 1, 6, 3};
        System.out.println(isSpecialArray(arrayPrueba));
        System.out.println(isSpecialArray(arrayPruebaDos));

    }
}
