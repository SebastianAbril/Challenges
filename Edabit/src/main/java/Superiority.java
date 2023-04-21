public class Superiority {
    public static boolean isFirstSuperior(Object[] a, Object[] b) {
        for(int i=0; i<a.length; i++){
            Comparable obj1 = (Comparable)a[i];
            Comparable obj2 = (Comparable)b[i];

            int result = obj1.compareTo(obj2);
            if(result > 0){
                return true;
            } else {
                continue;
            }
        }
        return false;
    }


}
