package Fundamentals.ObjectAndClasses.Exercise.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int countStudents = 1; countStudents <= n; countStudents++) {
            String[] studentsData = scanner.nextLine().split(" ");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            double grade = Double.parseDouble(studentsData[2]);

            Students students = new Students(firstName, lastName, grade);

            studentsList.add(students);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student : studentsList) {
            System.out.println(student.toString());
        }
    }
}
