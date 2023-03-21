public class OrthogonalVector {

    public static boolean isOrthogonal(int[] arr1, int[] arr2) {
        if (arr1.length == 2 && arr2.length == 2){
            int xComponent = arr1[0] * arr2[0];
            int yComponent = arr1[1] * arr2[1];
            return xComponent + yComponent == 0 ?true: false;
        } else {
            int xComponent = arr1[0] * arr2[0];
            int yComponent = arr1[1] * arr2[1];
            int ZComponent = arr1[2] * arr2[2];
            return xComponent + yComponent + ZComponent  == 0 ?true: false;
        }
    }

    public static void main (String[] args){
        int[] array1 = {1,2};
        int[] array2 = {2,-1};
        int[] array3 = {3,-1};
        int[] array4 = {7,5};
        int[] array5 = {1,2,0};
        int[] array6 = {2,-1,10};

        System.out.println(isOrthogonal(array1,array2));
        System.out.println(isOrthogonal(array3,array4));
        System.out.println(isOrthogonal(array5,array6));
    }
}
