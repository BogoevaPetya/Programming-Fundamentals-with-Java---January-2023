package Fundamentals.Methods;

import java.util.Scanner;

public class L09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        switch (input) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.print(getMax(firstNum, secondNum));
                break;
            case "char":
                char sym1 = scanner.nextLine().charAt(0);
                char sym2 = scanner.nextLine().charAt(0);
                System.out.print(getMax(sym1, sym2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.print(getMax(text1, text2));
                break;
        }
    }

    public static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static char getMax(char symbol1, char symbol2) {
        if (symbol1 > symbol2) {
            return symbol1;
        } else {
            return symbol2;
        }
    }

    public static String getMax(String text1, String text2) {
        if (text1.compareTo(text2) > 0) {
            return text1;
        } else {
            return text2;
        }
    }
}
