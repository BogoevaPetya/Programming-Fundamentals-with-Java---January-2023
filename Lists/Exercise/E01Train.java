package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")){
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                list.add(numberToAdd);
            } else {
                int number = Integer.parseInt(command.split(" ")[0]); //30
                for (int i = 0; i <= list.size() - 1; i++) {
                    int currentElement = list.get(i); //32
                    if (currentElement + number <= maxCapacity){
                        list.set( i, currentElement + number);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int element : list) {
            System.out.print(element + " ");
        }

    }
}
