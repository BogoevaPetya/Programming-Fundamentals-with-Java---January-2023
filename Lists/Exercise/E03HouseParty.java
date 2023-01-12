package Fundamentals.Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine(); //"Allie is going!"
            String[] commandData = command.split(" ");
            String name = commandData[0];

            if(commandData[2].equals("going!")){
                if (!list.contains(commandData[0])) {
                    list.add(commandData[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else {
                if (list.contains(name)){
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }

        }
        for (String guest : list) {
            System.out.println(guest);
        }
    }
}
