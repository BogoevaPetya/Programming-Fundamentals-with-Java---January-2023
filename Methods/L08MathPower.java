package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputNumber = Double.parseDouble(scanner.nextLine());
        double inputPower = Double.parseDouble(scanner.nextLine());

        double result = mathPower(inputNumber, inputPower);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.print(df.format(result));
    }

    public static double mathPower(double number, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
