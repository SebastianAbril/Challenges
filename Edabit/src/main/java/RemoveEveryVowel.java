public class RemoveEveryVowel {
    public static String removeVowels(String s) {
        return s.replaceAll("[aeiouAEIOU]","");
    }
}
