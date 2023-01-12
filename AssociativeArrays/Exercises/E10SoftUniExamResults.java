package Fundamentals.AssociativeArrays.Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> pointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("exam finished")){
            String[] splitInput = input.split("-");
            String name = splitInput[0];

            if(splitInput.length == 3){ //Peter-Java-84
                String language = splitInput[1];
                Integer points = Integer.parseInt(splitInput[2]);

                if(!pointsMap.containsKey(name)){
                    pointsMap.put(name, points);
                } else {
                    int currentPoints = pointsMap.get(name);
                    if(points > currentPoints){
                        pointsMap.put(name, points);
                    }
                }

                if(!languageCount.containsKey(language)){
                    languageCount.put(language, 1);
                } else {
                    languageCount.put(language, languageCount.get(language) + 1);
                }

            } else {
                pointsMap.remove(name);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        pointsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        languageCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
