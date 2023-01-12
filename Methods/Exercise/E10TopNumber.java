package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isDivisibleBy8(i) && isContainingOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDivisibleBy8(int number) {
        //29856
        int sumDigits = 0;
        while(number > 0) {
            int lastDigit = number % 10; //6
            sumDigits += lastDigit;

            number = number / 10;
        }
        return sumDigits % 8 == 0;
//        if (sumDigits % 8 == 0) {
//            return true;
//        } else {
//            return false;
//        }

    }

    public static boolean isContainingOddDigit(int number) {
        //23986
        while (number > 0) {
            int lastDigit = number % 10; //6

            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
