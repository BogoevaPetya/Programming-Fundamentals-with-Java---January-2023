package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) { //Add {number}
                int number = Integer.parseInt(command.split("\\s+")[1]);
                list.add(number);
            } else if (command.contains("Insert")) { //Insert {number} {index}
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(index, list)) {
                    list.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) { //Remove {index}
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(index, list)) {
                    list.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) { //Shift left {count}  first number becomes last 'count' times
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int times = 1; times <= count; times++) {
                    int firstNum = list.get(0);
                    list.remove(0);
                    list.add(firstNum);
                }
            } else if (command.contains("Shift right")) { //Shift left {count}  last number becomes first 'count' times
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int times = 1; times <= count; times++) {
                    int lastNum = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(0, lastNum);
                }
            }
            command = scanner.nextLine();
        }

        for (int number: list) {
            System.out.print(number + " ");
        }

    }

    public static boolean isValidIndex(int index, List<Integer> number) {
        return index >= 0 && index <= number.size() - 1;
    }
}
