package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    numList.add(numberToAdd);
                    break;
                case "Remove": //Remove 2
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt"://RemoveAt {index}
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(indexToRemove);
                    break;
                case "Insert": //Insert {number} {index}
                    int numberToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numList.add(indexToInsert, numberToInsert);
                    break;
            }

            inputLine = scanner.nextLine();

        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
