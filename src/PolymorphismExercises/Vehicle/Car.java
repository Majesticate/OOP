package PolymorphismExercises.Vehicle;


public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumptionInLitersPerKm, double fuelCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, fuelCapacity);
    }

    @Override
    public void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        super.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm + 0.9);
    }

    @Override
    public void drive(double distance) {
        double fuelNeedToTravelThisDistance = getFuelConsumptionInLitersPerKm() * distance;
        if (getFuelQuantity() > fuelNeedToTravelThisDistance) {
            setFuelQuantity(getFuelQuantity() - fuelNeedToTravelThisDistance);
            setDrivenKm(getDrivenKm() + distance);
        } else {
            System.out.println("Car needs refueling");
            return;
        }
        System.out.printf("Car travelled %s km%n", distance);
    }

    @Override
    public void refuel(double litres) {
        double afterRefuel = getFuelQuantity() + litres;
        if (litres <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        setFuelQuantity(getFuelQuantity() + litres);
    }
}
