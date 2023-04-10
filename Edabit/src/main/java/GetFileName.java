public class GetFileName {
    public static String getFilename(String path) {
        String[] splitedPath = path.split("/");
        String fileName = splitedPath[splitedPath.length-1];

        return fileName;
    }


    public static void main(String[] args) {
        String stringPrueba =  "C:/Projects/pil_tests/ascii/edabit.txt";
        String stringPruebaDos = "ffprobe.exe";

        System.out.println(getFilename(stringPrueba));
        System.out.println(getFilename(stringPruebaDos));
    }
}
