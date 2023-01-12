package Fundamentals.AssociativeArrays.Exercises;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class E01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for (char symbol : input.toCharArray()) {
            if(symbol == ' '){
                continue;
            }
            if(!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            } else {
                int currentValue = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentValue + 1);
            }
        }

        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
