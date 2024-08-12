package vehicle;

public abstract class Vehicle {
    String brand;
    FuelType fuelType;

    Vehicle(String brand, FuelType fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    abstract void start();
    abstract void move();
}
