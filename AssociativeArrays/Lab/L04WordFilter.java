package Fundamentals.AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class L04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kiwi orange banana apple

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), words));
    }
}
