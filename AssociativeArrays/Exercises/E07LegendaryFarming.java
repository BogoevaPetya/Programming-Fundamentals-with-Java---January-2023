package Fundamentals.AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        LinkedHashMap<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isItemObtained = false;
        while (!isItemObtained) {

            String[] inputArr = scanner.nextLine().split(" "); //"3", "Motes", "5", "stones", "5", "Shards"

            for (int i = 0; i <= inputArr.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = legendaryItems.get(material);
                    legendaryItems.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int currentQuantity = junkItems.get(material);
                        junkItems.put(material, currentQuantity + quantity);
                    }
                }

                if (legendaryItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    legendaryItems.put("shards", legendaryItems.get("shards") - 250);
                    isItemObtained = true;
                    break;
                } else if (legendaryItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendaryItems.put("fragments", legendaryItems.get("fragments") - 250);
                    isItemObtained = true;
                    break;
                } else if (legendaryItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendaryItems.put("motes", legendaryItems.get("motes") - 250);
                    isItemObtained = true;
                    break;
                }
            }

        }

        legendaryItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
