package Fundamentals.Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelsCount(text.toLowerCase());

    }
    public static void printVowelsCount(String text) {
        int counter = 0;
//        for (char symbol : text.toCharArray()) {
//            if (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i') {
//                counter++;
//            }
//        }
        for (char i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == 'a' || currentSymbol == 'o' || currentSymbol == 'u' || currentSymbol == 'e' || currentSymbol == 'i') {
                counter++;
            }
        }

        System.out.print(counter);
    }
}
