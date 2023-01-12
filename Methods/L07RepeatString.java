package Fundamentals.Methods;

import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printText(input);
        }
    }
    public static void printText(String text) {
        System.out.print(text);
    }
}
