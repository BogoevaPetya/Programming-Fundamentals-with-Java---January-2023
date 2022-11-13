package Fundamentals.BasicSintaxConditionalStatementsAndLoops.AdditionalExercises;

import java.util.Scanner;

public class A04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();

        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            char currentDigit = input.charAt(i);
            reverse += currentDigit;

        }

        System.out.println(reverse);
    }
}
