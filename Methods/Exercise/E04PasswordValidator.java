package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (isContainingAtLeast2Digits(input) && isContainingOnlyLettersAndDigits(input) && isContainingSufficientCharacters(input)) {
            System.out.println("Password is valid");
        }
        if (isContainingSufficientCharacters(input) == false) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (isContainingOnlyLettersAndDigits(input) == false) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (isContainingAtLeast2Digits(input) == false) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean isContainingSufficientCharacters (String text) {
        int counter = 0;
        for (char i = 0; i <= text.length() - 1; i++) {
            counter++;
        }
        if (counter >= 6 && counter <= 10) {
            return true;
        }
        return false;
    }

    public static boolean isContainingOnlyLettersAndDigits (String text) {
        boolean isValid = true;
        for (char i = 0; i <= text.length() - 1; i++) {
            char currentDigit = text.charAt(i);
            if (currentDigit >= 48 && currentDigit <= 57 || currentDigit >= 65 && currentDigit <= 90 || currentDigit >= 97 && currentDigit <= 122){
                continue;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean isContainingAtLeast2Digits (String text) {
        int counter = 0;
        for (char i = 0; i <= text.length() - 1; i++) {
            char currentDigit = text.charAt(i);
            if (currentDigit >= 48 && currentDigit <= 57) {
                counter++;
                if (counter > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
