package Fundamentals.Methods;

import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if(input.equals("add")) {
            add(num1, num2);
        } else if (input.equals("multiply")) {
            multiply(num1, num2);
        } else if (input.equals("subtract")) {
            subtract(num1, num2);
        } else if (input.equals("divide")) {
            divide(num1, num2);
        }

    }
    public static void add(int n1, int n2) {
        System.out.print(n1 + n2);
    }

    public static void multiply(int n1, int n2) {
        System.out.print(n1 * n2);
    }

    public static void subtract(int n1, int n2) {
        System.out.print(n1 - n2);
    }

    public static void divide(int n1, int n2) {
        System.out.print(n1 / n2);
    }
}
