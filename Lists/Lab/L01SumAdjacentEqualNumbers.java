package Fundamentals.Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3 3 6 1
        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {
            double currentNum = numberList.get(i);
            double nextNum = numberList.get(i + 1);

            if (currentNum == nextNum) {
                numberList.set(i, currentNum + nextNum);
                numberList.remove(i + 1);
                i = -1;
            }
        }

        DecimalFormat df = new DecimalFormat("0.#");
        for (int i = 0; i <= numberList.size() - 1; i++) {
            String currentNum =df.format(numberList.get(i));
            System.out.print(currentNum + " ");
        }
    }
}
