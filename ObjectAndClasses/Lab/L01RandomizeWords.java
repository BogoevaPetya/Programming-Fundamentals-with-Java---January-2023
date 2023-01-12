package Fundamentals.ObjectAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class L01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArr = input.split("\\s+");

        Random rndGenerator = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int index = rndGenerator.nextInt(wordsArr.length); //в скобите оказвам границата

            String oldWord = wordsArr[i];

            wordsArr[i] = wordsArr[index];
            wordsArr[index] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
