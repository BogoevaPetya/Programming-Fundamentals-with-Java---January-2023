package Fundamentals.Methods;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int inputAbs = Math.abs(input);

        System.out.print(getMultipleOfEvensAndOdds(inputAbs));

    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
         return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int number) {
        //12345 - 2,4
        int sumEvenDigits = 0;
        while (number > 0) {
            int currentDigit = number % 10; //2
            if (currentDigit % 2 == 0) {
                sumEvenDigits += currentDigit;
            }
            number = number / 10;
        }
        return sumEvenDigits;
    }

    public static int getSumOfOddDigits(int number) {
        //12345 - 1,3,5
        int sumOddDigits = 0;
        while (number > 0) {
            int currentDigit = number % 10; //2
            if (currentDigit % 2 != 0) {
                sumOddDigits += currentDigit;
            }
            number = number / 10;
        }
        return sumOddDigits;
    }
}
