public class BoxSeq {

    public static int boxSeq(int step) {

        if(step == 0){
            return 0;
        } else if(step == 1){
            return 3;
        }else if(step%2 == 0){
            return step;
        }else if(step%2 != 0){
            return step+2;
        } else {
            return 0;
        }

    }

    public static void main(String[] args){

        System.out.println(boxSeq(5));
    }
}
