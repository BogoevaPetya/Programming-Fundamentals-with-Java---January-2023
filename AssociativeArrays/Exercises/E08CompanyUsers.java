package Fundamentals.AssociativeArrays.Exercises;

import java.util.*;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("End")){//SoftUni -> AA12345
            String companyName = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];

            if(!map.containsKey(companyName)){
                map.put(companyName, new ArrayList<>());
                map.get(companyName).add(employeeID);
            } else {
                if(map.get(companyName).contains(employeeID)){
                    input = scanner.nextLine();
                    continue;
                }
                map.get(companyName).add(employeeID);
            }

            input = scanner.nextLine();
        }

        //SoftUni
        //-- AA12345
        //-- BB12345

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println();
            System.out.println("-- " + String.join(System.lineSeparator() + "-- ", entry.getValue()));
        }
    }
}
