package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int collectedSpices = 0;
        int days = 0;

        while (startingYield >= 100) {
            collectedSpices += startingYield - 26;

            startingYield -= 10;
            days++;
        }
        if (collectedSpices >= 26) {
            collectedSpices -= 26;
        }

        System.out.println(days);
        System.out.println(collectedSpices);
    }
}
