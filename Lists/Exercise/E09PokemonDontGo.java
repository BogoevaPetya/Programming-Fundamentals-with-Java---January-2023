package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumRemoved = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sumRemoved += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int firstNum = numbers.get(0);
                sumRemoved += firstNum;
                numbers.remove(0);
                int lastNum = numbers.get(numbers.size() - 1);
                numbers.add(0, lastNum);
                modifyList(numbers, firstNum);
            } else if (index > numbers.size() - 1) {
                int lastNum = numbers.get(numbers.size() - 1);
                sumRemoved += lastNum;
                numbers.remove(numbers.size() - 1);
                int firstNum = numbers.get(0);
                numbers.add(firstNum);
                modifyList(numbers, lastNum);
            }

        }

        System.out.print(sumRemoved);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
            int currentNum = numbers.get(indexInList);
            if (currentNum <= removedElement) {
                currentNum += removedElement;
            } else {
                currentNum -= removedElement;
            }
            numbers.set(indexInList, currentNum);
        }
    }
}
