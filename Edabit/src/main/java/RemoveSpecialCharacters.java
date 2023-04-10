public class RemoveSpecialCharacters {
    public static String removeSpecialCharacters(String s) {
        return s.replaceAll("[^a-zA-Z0-9-_ ]","");
    }
    public static void main(String[] args) {
        System.out.println(removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
        System.out.println(removeSpecialCharacters("The quick brown fox!"));
        System.out.println(removeSpecialCharacters("D0n$c sed_0-di0 du1"));
    }
}
