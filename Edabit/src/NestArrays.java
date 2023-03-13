public class NestArrays {

    public static boolean canNest(int[] array1, int[] array2){
        int array1Min = getMinValue(array1);
        int array1Max = getMaxValue(array1);

        int array2Min = getMinValue(array2);
        int array2Max = getMaxValue(array2);

        if(array1Min > array2Min && array1Max < array2Max ){
            return true;
        } else{
            return false;
        }
    }


    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]<minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]>maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}


/*
* arr1's min is greater than arr2's min.
arr1's max is less than arr2's max.
* */