package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int snowballSnow = 0;
        int maxSnowballSnow = Integer.MIN_VALUE;
        int snowballTime = 0;
        int maxSnowballTime = Integer.MIN_VALUE;
        int snowballQuality = 0;
        int maxSnowballQuality = Integer.MIN_VALUE;
        double maxSnowballValue = 0;


        for (int i = 1; i <= n; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality) ;
    }
}
