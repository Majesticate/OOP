package PolymorphismExercises.Vehicle;

public abstract class Vehicle implements Drivable, Refuelable {
    private double fuelQuantity;
    private double fuelConsumptionInLitersPerKm;
    private double fuelCapacity;
    private double drivenKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionInLitersPerKm, double fuelCapacity) {
        setFuelCapacity(fuelCapacity);
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
        this.drivenKm = 0;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }else if (this.fuelCapacity < fuelQuantity){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionInLitersPerKm() {
        return fuelConsumptionInLitersPerKm;
    }

    public void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        this.fuelConsumptionInLitersPerKm = fuelConsumptionInLitersPerKm;
    }

    public double getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(double drivenKm) {
        this.drivenKm = drivenKm;
    }
}
