package Fundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class L12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean isSpecialNumber = false;
        for (int i = 1; i <= n; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            String tF = "";
            if (isSpecialNumber) {
                tF = "True";
            } else {
                tF = "False";
            }
            System.out.printf("%d -> %s%n", currentNum, tF);
            sum = 0;
            i = currentNum;
        }
    }
}
