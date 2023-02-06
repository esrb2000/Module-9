package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        String clearedText = text.strip();
        int textLength = clearedText.length();
        int numberWord = 1;
        String modifiedString = "(1) ";
        if (textLength != 0) {
            for (int i = 0; i < textLength; i++) {
                modifiedString = modifiedString + clearedText.charAt(i);
                if (clearedText.charAt(i) == ' ') {
                    numberWord = numberWord + 1;
                    modifiedString = modifiedString + "(" + numberWord + ") ";
                }
            }
        } else {
            String emptyString = "";
            return emptyString;
        }
        return modifiedString;
    }
}
