package Fundamentals.BasicSintaxConditionalStatementsAndLoops.AdditionalExercises;

import java.util.Scanner;

public class A03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double moneyInTheBegining = currentBalance;
        String command = scanner.nextLine();

        while(!command.equals("Game Time")) {

            if (command.equals("OutFall 4")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 39.99;
                System.out.println("Bought OutFall 4");
            } else if (command.equals("CS: OG")) {
                if (currentBalance < 15.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 15.99;
                System.out.println("Bought CS: OG");
            } else if (command.equals("Zplinter Zell")) {
                if (currentBalance < 19.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 19.99;
                System.out.println("Bought Zplinter Zell");
            } else if (command.equals("Honored 2")) {
                if (currentBalance < 59.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 59.99;
                System.out.println("Bought Honored 2");
            } else if (command.equals("RoverWatch")) {
                if (currentBalance < 29.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 29.99;
                System.out.println("Bought RoverWatch");
            } else if (command.equals("RoverWatch Origins Edition")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                currentBalance = currentBalance - 39.99;
                System.out.println("Bought RoverWatch Origins Edition");
            } else {
                System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
        }

        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneyInTheBegining - currentBalance, currentBalance);
        }
    }
}
