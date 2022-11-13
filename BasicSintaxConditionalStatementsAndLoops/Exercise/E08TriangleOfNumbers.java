package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(current + " ");
            }

            current++;
            if (current > number) {
                break;
            }

            System.out.println();
        }
    }
}
