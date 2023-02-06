package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        int numberSpace = text.indexOf(" ");
        String modifiedString = "";
        int numberOfWord = 1;
        int textLength = text.length();
        if (textLength != 0) {
            for (int i = 0; i <= textLength; i++) {
                String word = text.substring(0, numberSpace);

                modifiedString = numberOfWord + modifiedString;
                numberOfWord = numberOfWord + 1;

            }
        } else {
            String emptyString = "";
            return emptyString;
        }
        return modifiedString;
    }
}
