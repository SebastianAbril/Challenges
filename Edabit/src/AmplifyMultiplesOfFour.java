public class AmplifyMultiplesOfFour {
    public static int[] amplify(int num) {
    int[] solution = new int[num];
    solution[0] = 1;

    for(int i=1; i<num; i++){
        System.out.println("este es i: "+i);
        if((i+1)%4 == 0){
            solution[i] = (i+1)*10;
        } else {
            solution[i] = (i+1);
        }
    }
    return solution;
    }

    public static void main(String[] args) {
    for(int number: amplify(4)){
        System.out.println(number);
    }
    }
}
