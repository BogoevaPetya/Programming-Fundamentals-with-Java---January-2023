package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int nAtTheBeginning = n;
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int pokes = 0;

        while (n >= m) {
            n -= m;
            pokes++;

            if (n == nAtTheBeginning * 0.5) {
                if (y > 0) {
                    n = n / y;
                }
            }
        }

        System.out.println(n);
        System.out.println(pokes);
    }
}
