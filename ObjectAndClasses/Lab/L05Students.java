package Fundamentals.ObjectAndClasses.Lab;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L05Students {

    public static class Students {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Students (String firstName, String lastName, int age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        List<Students> studentsList = new ArrayList<>();
        while (!inputLine.equals("end")){
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String secondName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

           Students currentStudent = new Students(firstName, secondName, age, town);
           studentsList.add(currentStudent);

            inputLine = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Students element : studentsList) {
            if (element.getTown().equals(cityName)){
                System.out.printf("%s %s is %d years old%n", element.getFirstName(), element.getLastName(), element.getAge());
            }
        }
    }
}
