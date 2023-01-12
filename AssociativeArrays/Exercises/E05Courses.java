package Fundamentals.AssociativeArrays.Exercises;

import java.util.*;

public class E05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courseInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){ //Programming Fundamentals : John Smith
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if(!courseInfo.containsKey(courseName)){
                courseInfo.put(courseName, new ArrayList<>());
                courseInfo.get(courseName).add(studentName);
            } else {
                courseInfo.get(courseName).add(studentName);
            }


            input = scanner.nextLine();
        }

        //Programming Fundamentals: 2
        //-- John Smith
        //-- Linda Johnson

        for (Map.Entry<String, List<String>> entry : courseInfo.entrySet()) {
            System.out.printf("%s: %d", entry.getKey(), entry.getValue().size());
            System.out.println();
            System.out.println("-- " + String.join(System.lineSeparator() + "-- ", entry.getValue()));
        }
    }
}
