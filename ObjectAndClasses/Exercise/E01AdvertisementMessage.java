package Fundamentals.ObjectAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

public class E01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rndGenerator = new Random();
        for (int i = 1; i <= n; i++) {
            int randomPhraseIndex = rndGenerator.nextInt(phrases.length); //phrases.length оказва границата
            int randomEventsIndex = rndGenerator.nextInt(events.length);
            int randomCitiesIndex = rndGenerator.nextInt(cities.length);
            int randomAuthorIndex = rndGenerator.nextInt(authors.length);

            String randomPhrase = phrases[randomPhraseIndex];
            String randomEvent = events[randomEventsIndex];
            String randomAuthors = authors[randomAuthorIndex];
            String randomCities = cities[randomCitiesIndex];

            System.out.println(randomPhrase + " " + randomEvent + " " + randomAuthors + " - " + randomCities);
        }


    }
}
