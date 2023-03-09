import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmailVerify {
    public static void verifyEmail(){

        String email = JOptionPane.showInputDialog("inroduce email.");
        boolean arroba = false;

        for (int i =0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                arroba = true;
            }
        }
        if(arroba == true){
            System.out.println("el email es correcto");
        } else {
            System.out.println("email no es correcto");
        }
    }
}
