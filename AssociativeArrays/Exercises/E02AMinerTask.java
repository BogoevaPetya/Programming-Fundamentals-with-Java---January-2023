package Fundamentals.AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = "";

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            resource = scanner.nextLine();

            if (resource.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!map.containsKey(resource)){
                map.put(resource, quantity);
            } else {
                int currentQuantity = map.get(resource);
                map.put(resource, currentQuantity + quantity);
            }

        }

        map.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }
}
