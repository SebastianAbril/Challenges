public class VowelReplacer {
    public static String replaceVowels(String str, char ch) {
        return str.replaceAll("[aeiou]", String.valueOf(ch));

    }
}
