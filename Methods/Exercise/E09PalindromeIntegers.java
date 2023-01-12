package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")) {
            System.out.println(isPalindrome(input));

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {
        String reversedText = getReversedText(text);
        if (text.equals(reversedText)) {
            return true;
        } else {
            return false;
        }
    }

    public static String getReversedText(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char currentSymbol = text.charAt(i);
            reversedText += currentSymbol;
        }
        return reversedText;
    }
}
