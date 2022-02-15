package InheritanceExercises.hierarchy;

public class Vehicle {
    //•	DEFAULT_FUEL_CONSUMPTION – final static double (constant)
    //•	fuelConsumption –double
    //•	fuel – double
    //•	horsePower – int
    //•	Getters and Setters for the fields
    //•	A public constructor which accepts (fuel, horsePower) and set the default fuel consumption on the field fuelConsumption
    //•	void drive(double kilometers)
    //o	The drive method should have a functionality to reduce the fuel based on the travelled kilometers and fuel consumption. Keep in mind that you can drive the vehicle only if you have enough fuel to finish the driving.
    //The default fuel consumption for Vehicle is 1.25. Some of the classes have different default fuel consumption:
    //•	SportCar – DEFAULT_FUEL_CONSUMPTION = 10
    //•	RaceMotorcycle – DEFAULT_FUEL_CONSUMPTION = 8
    //•	Car – DEFAULT_FUEL_CONSUMPTION = 3

    public static final double DEFAULT_FUEL_CONSUMPTION = 0;

    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = 1.25;
    }

    public void drive(double kilometres){
        // kilometers 50;
        //fuel 20;
        //fuelConsumption 4;
        double neededFuel = (kilometres * this.fuelConsumption) / 100;
        if (this.fuel >= neededFuel){
            this.fuel -= neededFuel;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
