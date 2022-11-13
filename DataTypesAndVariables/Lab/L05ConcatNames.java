package Fundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class L05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        String result = String.format("%s%s%s", firstName, delimeter, secondName);
        System.out.println(result);
    }
}
