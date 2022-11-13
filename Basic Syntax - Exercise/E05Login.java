package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        String enteredPassword = scanner.nextLine();
        while (!password.equals(enteredPassword)) {
            counter++;
            if (counter > 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (password.equals(enteredPassword)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
