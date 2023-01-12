package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);

    }

    public static void printMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            for (char i = 0; i <= text.length() - 1; i++) {
                int result = text.length() / 2 ;
                char middleCharacter = text.charAt(result);
                System.out.println(middleCharacter);
                break;
            }
        } else {
            for (char i = 0; i <= text.length() - 1; i++) {
                int result1 = text.length() / 2;
                int result2 = text.length() / 2 - 1;
                char middleCharacter1 = text.charAt(result1);
                char middleCharacter2 = text.charAt(result2);
                System.out.println(middleCharacter2 + "" + middleCharacter1);
                break;
            }
        }
    }
}
