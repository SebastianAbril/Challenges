public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {
          int[] arraySolution = new int[length];
          int  counter = 0;
          for(int i =0; i< arraySolution.length;i++){
              counter += num;
             arraySolution[i] = counter;

          }
          return arraySolution;
    }
}
