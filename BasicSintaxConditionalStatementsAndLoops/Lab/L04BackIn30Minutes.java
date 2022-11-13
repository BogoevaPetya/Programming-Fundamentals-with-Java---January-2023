package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class L04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int timeAfter30Min = hour * 60 + min + 30;

        int hour2 = timeAfter30Min / 60;
        int min2 = timeAfter30Min % 60;

        if (hour2 > 23) {
            hour2 = 0;
        }

        System.out.printf("%d:%02d", hour2, min2);
    }
}
