package Fundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class L08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);
//
//        if (letter >= 'a' && letter <= 'z') {
//            System.out.print("lower-case");
//        } else if (letter >= 'A' && letter <= 'Z') {
//            System.out.print("upper-case");
//        }

        if (Character.isLowerCase(letter)) {
            System.out.print("lower-case");
        } else if (Character.isUpperCase(letter)) {
            System.out.print("upper-case");
        }
    }
}
