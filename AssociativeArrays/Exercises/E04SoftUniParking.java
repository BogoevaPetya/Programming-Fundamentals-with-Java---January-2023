package Fundamentals.AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> visitorsInfo = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            if(command.equals("register")){
                String name = input.split(" ")[1];
                String licenseNumber = input.split(" ")[2];
                if(visitorsInfo.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s%n", licenseNumber);
                    continue;
                }
                visitorsInfo.put(name, licenseNumber);
                System.out.printf("%s registered %s successfully%n", name, licenseNumber);
            } else if (command.equals("unregister")){
                String name = input.split(" ")[1];
                if(!visitorsInfo.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n", name);
                    continue;
                }
                visitorsInfo.remove(name);
                System.out.printf("%s unregistered successfully%n", name);
            }
        }

        visitorsInfo.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
