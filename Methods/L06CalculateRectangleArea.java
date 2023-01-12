package Fundamentals.Methods;

import java.util.Scanner;

public class L06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int result = getRectangleArea(width, length);
        System.out.print(result);

        //System.out.print(getRectangleArea(width, length));
    }

    public static int getRectangleArea(int num1, int num2) {
        return num1 * num2;
    }
}



