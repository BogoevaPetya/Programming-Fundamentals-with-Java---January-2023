package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 2 3 4 5
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listSize = numberList.size();
        for (int i = 0; i < listSize / 2; i++) {
            int currentNum = numberList.get(i);
            int lastNum = numberList.get(numberList.size() - 1);
            numberList.set(i, currentNum + lastNum);
            numberList.remove(numberList.size() - 1);
        }

        for (int element : numberList) {
            System.out.print(element + " ");
        }

    }
}
