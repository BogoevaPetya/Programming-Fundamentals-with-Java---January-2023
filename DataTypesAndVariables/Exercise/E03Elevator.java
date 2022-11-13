package Fundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        while (numberOfPeople  >= capacity) {
            courses++;
            numberOfPeople = numberOfPeople - capacity;
        }

        if (numberOfPeople > 0) {
            courses++;
        }

        System.out.print(courses);
    }
}
