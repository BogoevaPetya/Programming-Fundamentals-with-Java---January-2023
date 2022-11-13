package Fundamentals.BasicSintaxConditionalStatementsAndLoops.AdditionalExercises;

import java.util.Scanner;

public class A02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastDigit = number % 10;

        if (lastDigit == 0) {
            System.out.print("zero");
        } else if (lastDigit == 1) {
            System.out.print("one");
        } else if (lastDigit == 2) {
            System.out.print("two");
        } else if (lastDigit == 3) {
            System.out.print("three");
        } else if (lastDigit == 4) {
            System.out.print("four");
        } else if (lastDigit == 5) {
            System.out.print("five");
        } else if (lastDigit == 6) {
            System.out.print("six");
        } else if (lastDigit == 7) {
            System.out.print("seven");
        } else if (lastDigit == 8) {
            System.out.print("eight");
        } else if (lastDigit == 9) {
            System.out.print("nine");
        }

    }
}
