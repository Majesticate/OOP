package PolymorphismExercises.VehiclesExtension;

import PolymorphismExercises.Vehicle.Vehicle;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumptionInLitersPerKm, double fuelCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, fuelCapacity);
    }

    @Override
    public void drive(double distance) {
        double fuelNeedToTravelThisDistance = (getFuelConsumptionInLitersPerKm() + 1.4) * distance;
        if (getFuelQuantity() > fuelNeedToTravelThisDistance) {
            setFuelQuantity(getFuelQuantity() - fuelNeedToTravelThisDistance);
            setDrivenKm(getDrivenKm() + distance);
        } else {
            System.out.println("Bus needs refueling");
            return;
        }
        System.out.printf("Bus travelled %s km%n", distance);
    }
    
    @Override
    public void refuel(double litres) {
        if (litres <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        setFuelQuantity(getFuelQuantity() + litres);
    }

    public void driveEmpty(double distance) {
        double fuelNeedToTravelThisDistance = getFuelConsumptionInLitersPerKm() * distance;
        if (getFuelQuantity() > fuelNeedToTravelThisDistance) {
            setFuelQuantity(getFuelQuantity() - fuelNeedToTravelThisDistance);
            setDrivenKm(getDrivenKm() + distance);
        } else {
            System.out.println("Bus needs refueling");
            return;
        }
        System.out.printf("Bus travelled %s km%n", distance);
    }
}
