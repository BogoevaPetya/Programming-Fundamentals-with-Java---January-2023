package Fundamentals.ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L06Students2 {

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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    static int findStudentIndex (List<Students> students, String firstName, String lastName){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
            && students.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }
        return - 1;
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

            int existingIndex = findStudentIndex(studentsList, currentStudent.getFirstName(), currentStudent.getLastName());
            if (existingIndex != -1){
                studentsList.get(existingIndex).setTown(currentStudent.town);
                studentsList.get(existingIndex).setAge(currentStudent.age);
            } else {
                studentsList.add(currentStudent);
            }

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
