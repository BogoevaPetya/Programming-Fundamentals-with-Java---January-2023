package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String typeDay = scanner.nextLine();
        double price = 0;

        if (typeGroup.equals("Students")) {
            if (typeDay.equals("Friday")) {
                price = 8.45 * countPeople;
            } else if (typeDay.equals("Saturday")) {
                price = 9.80 * countPeople;
            } else if (typeDay.equals("Sunday")) {
                price = 10.46 * countPeople;
            }
            if (countPeople >= 30) {
                price = price - (price * 0.15);
            }
        } else if (typeGroup.equals("Business")) {
            if (countPeople >= 100) {
                countPeople = countPeople - 10;
            }

            if (typeDay.equals("Friday")) {
                price = 10.90 * countPeople;
            } else if (typeDay.equals("Saturday")) {
                price = 15.60 * countPeople;
            } else if (typeDay.equals("Sunday")) {
                price = 16 * countPeople;
            }
        } else if (typeGroup.equals("Regular")) {
            if (typeDay.equals("Friday")) {
                price = 15 * countPeople;
            } else if (typeDay.equals("Saturday")) {
                price = 20 * countPeople;
            } else if (typeDay.equals("Sunday")) {
                price = 22.50 * countPeople;
            }
            if (countPeople >= 10 && countPeople <= 20) {
                price = price - (price * 0.05);
            }
        }

        System.out.printf("Total price: %.2f", price);
    }
}
