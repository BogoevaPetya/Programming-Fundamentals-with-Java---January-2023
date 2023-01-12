package Fundamentals.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class L07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        numList.removeIf(e -> e < 0);

        Collections.reverse(numList);

        if (numList.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
