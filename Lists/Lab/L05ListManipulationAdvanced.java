package Fundamentals.Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split("\\s+");
            String command = commandArr[0];

            if (command.equals("Contains")) {
                int number = Integer.parseInt(commandArr[1]);
                if (numList.contains(number) == true) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (command.equals("Print")) {
                String command2 = commandArr[1];
                if (command2.equals("even")) {
                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentElement = numList.get(i);
                        if (currentElement % 2 == 0) {
                            if (i == numList.size() - 1) {
                                System.out.print(currentElement);
                            } else {
                                System.out.print(currentElement + " ");
                            }
                        }
                    }
                    System.out.println();
                } else {
                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentElement = numList.get(i);
                        if (currentElement % 2 != 0) {
                            if (i == numList.size() - 1) {
                                System.out.print(currentElement);
                            } else {
                                System.out.print(currentElement + " ");
                            }
                        }
                    }
                    System.out.println();
                }

            } else if (command.equals("Get")) {
                int sum = 0;
                for (int i = 0; i < numList.size(); i++) {
                    int currentElement = numList.get(i);
                    sum += currentElement;
                }
                System.out.print(sum);
                System.out.println();

            } else if (command.equals("Filter")) {
                int numberToFilter = Integer.parseInt(commandArr[2]);

                if (commandArr[1].equals("<")) {
                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);
                        if (currentNum < numberToFilter) {
                            System.out.print(currentNum + " ");
                        }
                    }
                    System.out.println();
                } else if (commandArr[1].equals(">")) {
                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);
                        if (currentNum > numberToFilter) {
                            System.out.print(currentNum + " ");
                        }
                    }
                    System.out.println();
                } else if (commandArr[1].equals(">=")) {
                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);
                        if (currentNum >= numberToFilter) {
                            System.out.print(currentNum + " ");
                        }
                    }
                    System.out.println();

                } else if (commandArr[1].equals("<=")) {
                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);
                        if (currentNum <= numberToFilter) {
                            System.out.print(currentNum + " ");
                        }
                    }
                    System.out.println();
                }
            }

            inputLine = scanner.nextLine();
        }
    }
}
