package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.print(df.format(calculate(number1, operator, number2)));

    }
    public static double calculate(int num1, String operator, int num2) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }

        return result;
    }
}
