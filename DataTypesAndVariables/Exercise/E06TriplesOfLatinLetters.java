package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int letter1 = 97; letter1 < 97 + n; letter1++) {
            for (int letter2 = 97; letter2 < 97 + n; letter2++) {
                for (int letter3 = 97; letter3 < 97 + n; letter3++) {
                    char letter = (char)letter3;
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
    }
}

//       for (char letter1 = 'a'; letter1 < 'a' + n; letter1++) {
//           for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
//               for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
//                   System.out.printf("%c%c%c%n", letter1, letter2, letter3);