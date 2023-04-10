import java.util.Arrays;

public class SecretSociety {
    public static String societyName(String[] friends) {
    String societyNameSolution = "";
    Arrays.sort(friends);
    for(String name: friends){
        char letter = name.charAt(0);
        societyNameSolution += letter;
    }
    return societyNameSolution;
    }
    public static void main(String[] args) {
    String[] arrayPrueba = {"Adam", "Sarah", "Malcolm"};

        System.out.println(societyName(arrayPrueba));
    }
}
