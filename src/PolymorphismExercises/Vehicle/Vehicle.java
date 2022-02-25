package PolymorphismExercises.Vehicle;

public abstract class Vehicle implements Drivable, Refuelable {
    private double fuelQuantity;
    private double fuelConsumptionInLitersPerKm;
    private double drivenKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
        this.drivenKm = 0;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
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
