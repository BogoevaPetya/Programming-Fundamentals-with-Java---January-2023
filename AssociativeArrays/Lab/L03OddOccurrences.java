package Fundamentals.AssociativeArrays.Lab;

import java.util.*;

public class L03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> listMap = new LinkedHashMap<>();
        for (String word : input) {
            word = word.toLowerCase();

            if(!listMap.containsKey(word)){
                listMap.put(word, 1);
            } else {
                listMap.put(word, listMap.get(word) + 1);
            }
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
            if(entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }


        System.out.print(String.join(", ", resultList));
    }
}
