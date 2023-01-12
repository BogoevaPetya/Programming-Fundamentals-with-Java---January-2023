package Fundamentals.ObjectAndClasses.Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();

        double allHorsepowerCars = 0;
        double allHorsePowerTrucks = 0;
        int carsCounter = 0;
        int trucksCounter = 0;
        while (!input.equals("End")){
            String[] inputArr = input.split(" ");
            String typeVehicle = inputArr[0];
            String model = inputArr[1];
            String color = inputArr[2];
            if (typeVehicle.equals("truck")){
                int horsePower = Integer.parseInt(inputArr[3]);
                allHorsePowerTrucks += horsePower;
                trucksCounter++;
            } else if (typeVehicle.equals("car")) {
                int horsePower = Integer.parseInt(inputArr[3]);
                allHorsepowerCars += horsePower;
                carsCounter++;
            }

            int horsePower = Integer.parseInt(inputArr[3]);

            Vehicle vehicle = new Vehicle(typeVehicle, model, color, horsePower);
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")){
            for (Vehicle vehicle :vehicleList) {
                if (vehicle.getModel().equals(model)){
                    System.out.println(vehicle.toString());
                }
            }

            model = scanner.nextLine();
        }

        double avgHorsePowerTrucks = allHorsePowerTrucks / trucksCounter;
        double avgHorsePowerCars = allHorsepowerCars / carsCounter;

        if (carsCounter == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", avgHorsePowerCars);
        }

        if (trucksCounter == 0){
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", avgHorsePowerTrucks);
        }


    }
}
