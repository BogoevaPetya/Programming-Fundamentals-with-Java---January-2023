package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E05AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sumNumbers(number1, number2);
        int subtractNumbers = subtractNumbers(sumOfNumbers, number3);

        System.out.print(subtractNumbers);


    }

    public static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
}
