package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());
        double priceForTheCoffee = 0;
        double sumTotalPrice = 0;

        for (int i = 1; i <= countOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            priceForTheCoffee = pricePerCapsule * days* capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n", priceForTheCoffee);

            sumTotalPrice += priceForTheCoffee;
        }

        System.out.printf("Total: $%.2f", sumTotalPrice);
    }
}
