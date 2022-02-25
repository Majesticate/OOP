package PolymorphismExercises.Vehicle;


public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm);
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
        setFuelQuantity(getFuelQuantity() + litres);
    }
}
