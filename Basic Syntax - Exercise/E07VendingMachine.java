package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumInsertedMoney = 0;
        while(!input.equals("Start")) {
            double insertedMoney = Double.parseDouble(input);
            if (insertedMoney != 0.1 && insertedMoney != 0.2 && insertedMoney != 0.5 && insertedMoney != 1 && insertedMoney != 2) {
                System.out.printf("Cannot accept %.2f%n", insertedMoney);
                input = scanner.nextLine();
                continue;
            }
            sumInsertedMoney += insertedMoney;

            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            if (product.equals("Nuts")) {
                if (sumInsertedMoney < 2.0) {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                    continue;
                }
                sumInsertedMoney = sumInsertedMoney - 2.0;
                System.out.printf("Purchased Nuts%n");
            } else if (product.equals("Water")) {
                if (sumInsertedMoney < 0.70) {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                    continue;
                }
                sumInsertedMoney = sumInsertedMoney - 0.70;
                System.out.printf("Purchased Water%n");
            } else if (product.equals("Crisps")) {
                if (sumInsertedMoney < 1.50) {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                    continue;
                }
                sumInsertedMoney = sumInsertedMoney - 1.50;
                System.out.printf("Purchased Crisps%n");
            } else if (product.equals("Soda")) {
                if (sumInsertedMoney < 0.80) {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                    continue;
                }
                sumInsertedMoney = sumInsertedMoney - 0.80;
                System.out.printf("Purchased Soda%n");
            } else if (product.equals("Coke")) {
                if (sumInsertedMoney < 1.0) {
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();
                    continue;
                }
                sumInsertedMoney = sumInsertedMoney - 1.0;
                System.out.printf("Purchased Coke%n");
            } else {
                System.out.println("Invalid product");
            }
            if (sumInsertedMoney <= 0) {
                break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumInsertedMoney);
    }
}
