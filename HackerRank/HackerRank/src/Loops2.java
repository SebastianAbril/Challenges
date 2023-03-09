import java.util.Scanner;

public class Loops2 {

        public static void Loops2(){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int s = 0;


                for(int j=0; j<n; j++){
                    s =   s +  a + (int) Math.pow(2,j) * b;
                    System.out.println(s + " ");
                }

                System.out.println();
            }
            in.close();
        }



}

/*  2 0 2 10 */