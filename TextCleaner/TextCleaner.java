public class TextCleaner {
    public static String cleanText(String input) {
        if (input == null || input.isEmpty()){
            return "";
        }
        String noLineBreaks = input.replaceAll("\n", " ").replaceAll("\r", " ");

        String singleSpaced = noLineBreaks.replaceAll("\\s+", " ");

        return singleSpaced.trim();
    }
}