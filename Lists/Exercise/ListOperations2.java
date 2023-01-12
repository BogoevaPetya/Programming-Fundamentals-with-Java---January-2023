package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("End")){
            if (command.contains("Add")){
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                list.add(numberToAdd);
            } else if (command.contains("Insert")){
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index <= list.size() - 1){
                    list.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (index >= 0 && index <= list.size() - 1){
                    list.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")){
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int times = 1; times <= count; times++) {
                    list.add(list.get(0));
                    list.remove(0);
                }
            } else if (command.contains("Shift right")){
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int times = 1; times <= count; times++) {
                    int lastNumber = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(0, lastNumber);
                }
            }

            command = scanner.nextLine();
        }

        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}
