public class FindNaN {
    public static int findNaN(double[] n) {
        int result=0;

        for(int i=0; i<n.length; i++){
            if(String.valueOf(n[i]).equals("NaN")){
                result = i;
                return result;
            } else {
                result = -1;
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        double[] arrayPrueba = {2.0*0/0, 1, 2, 3, 4};
        System.out.println(findNaN(arrayPrueba));
    }
}
