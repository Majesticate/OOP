package PolymorphismExercises.Vehicle;


public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm);
    }

    @Override
    public void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        super.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm + 1.6);
    }

    @Override
    public void drive(double distance) {
        double fuelNeedToTravelThisDistance = getFuelConsumptionInLitersPerKm() * distance;
        if (getFuelQuantity() > fuelNeedToTravelThisDistance) {
            setFuelQuantity(getFuelQuantity() - fuelNeedToTravelThisDistance);
            setDrivenKm(getDrivenKm() + distance);
        } else {
            System.out.println("Truck needs refueling");
            return;
        }
        System.out.printf("Truck travelled %s km%n", distance);
    }

    @Override
    public void refuel(double litres) {
        setFuelQuantity(getFuelQuantity() + (litres * 0.95));
    }
}
