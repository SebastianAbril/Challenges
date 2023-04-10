public class FactorChain {
    public static boolean factorChain(int[] arr) {
        boolean solution;
        int solutionCount=1;
    for(int i=1; i< arr.length;i++){
        if( arr[i]%arr[i-1] == 0){
            solutionCount++;
        }
    }
    return solutionCount == arr.length? true: false;
    }

    public static void main(String[] args) {
        int[] arrayPrueba = {1, 2, 4, 8, 16, 32};
        int[] arrayPruebaDos = {2, 4, 6, 7, 12};

        System.out.println("arrayPrueba uno: "+factorChain(arrayPrueba));
        System.out.println("arrayPrueba dos: "+factorChain(arrayPruebaDos));
    }
}
