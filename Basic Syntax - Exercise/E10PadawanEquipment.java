package Fundamentals.BasicSintaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class E10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double allLightsabers = countStudents + Math.ceil(countStudents * 0.10);

        int freeBelts = countStudents / 6;

        double finalSum = lightsabersPrice * allLightsabers + robesPrice * countStudents + beltPrice * (countStudents - freeBelts);

        if (availableMoney >= finalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", finalSum - availableMoney);
        }
    }
}
