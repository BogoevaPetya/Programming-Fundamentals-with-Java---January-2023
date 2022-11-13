package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int sumFact = 0;

        while (number > 0) {
            int digit = number % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;

            }
            sumFact += fact;

            number = number / 10;
        }

        if (initialNumber == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
