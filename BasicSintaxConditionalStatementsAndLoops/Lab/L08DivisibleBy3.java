package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class L08DivisibleBy3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        
    }
}
