package Fundamentals.AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> list = new TreeMap<>();
        for (double num : input) {
            if (!list.containsKey(num)){
                list.put(num, 1);
            } else {
                int value = list.get(num);
                list.put(num, value + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : list.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
