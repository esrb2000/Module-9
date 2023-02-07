package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    String clearedText = text.strip();
    String regex = "[0-9.,:;]";
    clearedText = clearedText.replaceAll(regex, "");
    String [] words = clearedText.split("\s+");
    String splitText = "";
    for (int i = 0; i < words.length - 1; i++) {
      words[i] = words[i] + '\n';
      splitText = splitText + words[i];
    }
    splitText = splitText + words[words.length - 1];
    return splitText;
  }
}