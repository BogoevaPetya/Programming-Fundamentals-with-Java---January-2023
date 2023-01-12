package Fundamentals.Methods;

import java.util.Scanner;

public class L03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTriangle(num);

    }

    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            printRows(i);
        }
        for (int i = num - 1; i >= 1; i--) {
            printRows(i);
        }
    }
    
    public static void printRows(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
