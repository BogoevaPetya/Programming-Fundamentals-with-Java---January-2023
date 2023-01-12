package Fundamentals.ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L04Songs {

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("_");

            Song currentSong = new Song(input[0], input[1], input[2]); //обект!!!
            listSongs.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song element : listSongs) {
                System.out.println(element.getName());
            }
        } else {
            for (Song element: listSongs) {
                if (element.getTypeList().equals(command)){
                    System.out.println(element.getName());
                }
            }
        }


    }
}
