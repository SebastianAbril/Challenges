public class FixTheSpacing {
    public static String correctSpacing(String sentence) {
    String trimmedString = sentence.trim();
    String solution = trimmedString.replaceAll("\\s+"," ");
    return solution;
    }

}
