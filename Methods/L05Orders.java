package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printTotalSum(product, quantity);
    }

    public static void printTotalSum(String text, int num) {
        if (text.equals("coffee")) {
            double result = 1.50 * num;
            System.out.printf("%.2f", result);
        } else if (text.equals("water")) {
            double result = 1.00 * num;
            System.out.printf("%.2f", result);
        } else if (text.equals("coke")) {
            double result = 1.40 * num;
            System.out.printf("%.2f", result);
        } else {
            double result = 2.00 * num;
            System.out.printf("%.2f", result);
        }
    }
}
