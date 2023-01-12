package Fundamentals.AssociativeArrays.Exercises;

import java.util.*;

public class E03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);

            if(!map.containsKey(product)){
                map.put(product, new ArrayList<>());
                map.get(product).add(price);
                map.get(product).add(quantity);
            } else {
                map.get(product).set(0, price); //обновявам цената с новата
                double currentQuantity = map.get(product).get(1); //взимам старото количество
                map.get(product).set(1, currentQuantity + quantity); //сумирам старото и новото количество
            }

            input = scanner.nextLine();
        }

     map.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1)));

    }
}
