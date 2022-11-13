package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class L07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;
        boolean isValid = true;

        if (age >= 0 && age <= 18) {
            if (typeOfDay.equals("Weekday")) {
                ticketPrice = 12;
            } else if (typeOfDay.equals("Weekend")) {
                ticketPrice = 15;
            } else if (typeOfDay.equals("Holiday")) {
                ticketPrice = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals("Weekday")) {
                ticketPrice = 18;
            } else if (typeOfDay.equals("Weekend")) {
                ticketPrice = 20;
            } else if (typeOfDay.equals("Holiday")) {
                ticketPrice = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals("Weekday")) {
                ticketPrice = 12;
            } else if (typeOfDay.equals("Weekend")) {
                ticketPrice = 15;
            } else if (typeOfDay.equals("Holiday")) {
                ticketPrice = 10;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.println(ticketPrice + "$");
        } else {
            System.out.print("Error!");
        }
    }
}
