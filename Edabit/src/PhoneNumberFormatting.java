import java.util.Arrays;

public class PhoneNumberFormatting {
    public static String formatPhoneNumber(int[] nums) {
        String stringedArray = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s","");
        String firsThreeNumbers =  stringedArray.substring(0,3);
        String secondThreeNumbers = stringedArray.substring(4,7);
        String thirdThreeNumbers = stringedArray.substring(7,10);

        return  "("+firsThreeNumbers+") "+secondThreeNumbers+"-"+thirdThreeNumbers;
    }
}
