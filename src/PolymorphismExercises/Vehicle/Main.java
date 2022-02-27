package PolymorphismExercises.Vehicle;

import PolymorphismExercises.VehiclesExtension.Bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split("\\s+");
        String[] truckTokens = scanner.nextLine().split("\\s+");
        String[] busTokens = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));
        Bus bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String typeOfVehicle = tokens[1];
            double distanceOrLitres = Double.parseDouble(tokens[2]);

            if (typeOfVehicle.equals("Car")) {
                if (command.equals("Drive")) {
                    car.drive(distanceOrLitres);
                } else if (command.equals("Refuel")) {
                    car.refuel(distanceOrLitres);
                }
            } else if (typeOfVehicle.equals("Truck")) {
                if (command.equals("Drive")) {
                    truck.drive(distanceOrLitres);
                } else if (command.equals("Refuel")) {
                    truck.refuel(distanceOrLitres);
                }
            }else if (typeOfVehicle.equals("Bus")){
                if (command.equals("Drive")){
                     bus.drive(distanceOrLitres);
                }else if (command.equals("DriveEmpty")){
                    bus.driveEmpty(distanceOrLitres);
                }else if (command.equals("Refuel")){
                    bus.refuel(distanceOrLitres);
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
