package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }
      String regex = "[^0-9]";
      input = input.replaceAll(regex, "");
      String[] number = input.split("");
      String outputNumber = "";
      if (number.length > 11 || number.length < 10) {
        System.out.println("Неверный формат номера");
      } else if ( number.length == 10) {
        outputNumber = outputNumber + "7";
        for (int i = 0; i < number.length; i++) {
          outputNumber = outputNumber + number[i];
        }
      } else if (number[0].equals("8")) {
        outputNumber = outputNumber + "7";
        for (int i = 1; i < number.length; i++) {
          outputNumber = outputNumber + number[i];
        }
      } else if (!number[0].equals("8") && !number[0].equals("7")) {
        System.out.println("Неверный формат номера");
      } else { for (int i = 0; i < number.length; i++) {
          outputNumber = outputNumber + number[i];
        }
      }
        System.out.println(outputNumber);
    }
  }
}
