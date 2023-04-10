public class ConcatArrays {
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arrayResult = new int[arr1.length + arr2.length];

        for(int i=0; i< arr1.length;i++){
            arrayResult[i] = arr1[i];
        }

        for(int j=0; j<arr2.length;j++){
            arrayResult[j+arr1.length] = arr2[j];
        }
        return arrayResult;
    }

    public static void main(String[] args){
        int[] arrayPrueba1 = {1,2,3,4};
        int[] arrayPrueba2 = {5,6,7,8};

        int[] arrayFinal = concat(arrayPrueba1,arrayPrueba2);
        for(int element: arrayFinal ){
            System.out.println(element);
        }
    }
}
