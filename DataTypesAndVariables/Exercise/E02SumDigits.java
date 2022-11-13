package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number > 0){
            int currentNumber = number;
            int lastDigit = currentNumber % 10;
            sum += lastDigit;

            number = currentNumber / 10;
        }

        System.out.print(sum);
    }
}
