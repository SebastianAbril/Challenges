import java.util.Arrays;

public class PhoneNumberFormatting2 {
    public static String formatPhoneNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for(int i:nums){
            sb.append(i);
        }
        sb.insert(0, "(");
        sb.insert(4, ")");
        sb.insert(5," ");
        sb.insert(9, "-");

        return sb.toString();
    }
}
