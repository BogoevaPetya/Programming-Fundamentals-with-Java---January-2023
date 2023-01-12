package Fundamentals.Methods;

import java.util.Scanner;

public class L01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        signOfInteger(input);

    }

    public static void signOfInteger(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
