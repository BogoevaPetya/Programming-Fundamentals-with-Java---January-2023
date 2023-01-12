package Fundamentals.AssociativeArrays.Exercises;

import java.util.*;

public class E09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if (!map.containsKey(team)) {
                    map.put(team, new ArrayList<>());
                }

                boolean isExistingUser = false;
                for (List<String> list : map.values()) {
                    if (list.contains(player)) {
                        isExistingUser = true;
                    }
                }

                if (!isExistingUser) {
                    map.get(team).add(player);
                }

            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(player)){
                        map.get(entry.getKey()).remove(player);
                        break;
                    }
                }


                //map.entrySet().forEach(entry -> entry.getValue().remove(player));

                if (map.containsKey(team)) {
                    List<String> currentPlayers = map.get(team);
                    currentPlayers.add(player);
                } else {
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);


            }
            input = scanner.nextLine();
        }

        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });


    }
}


