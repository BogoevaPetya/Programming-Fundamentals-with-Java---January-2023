package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sumPouredWater = 0;

        for (int i = 1; i <= n; i++) {
            int waterToPour = Integer.parseInt(scanner.nextLine());

            if (capacity < waterToPour) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacity -= waterToPour;
            sumPouredWater += waterToPour;
        }

        System.out.printf("%d", sumPouredWater);
    }
}
