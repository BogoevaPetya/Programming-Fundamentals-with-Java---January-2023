package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class E11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsetCount++;
            }
            if (i % 3 == 0) {
                mouseCount++;
            }
            if (i % 6 == 0) {
                keyboardCount++;
            }
            if (i % 12 == 0) {
                displayCount++;
            }
        }

        double allExpenses = headsetCount * headsetPrice + mouseCount * mousePrice + keyboardCount * keyboardPrice + displayCount * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", allExpenses);
    }
}
