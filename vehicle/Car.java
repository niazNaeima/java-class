package vehicle;

public class Car extends Vehicle {
    BodyType bodyType;
    static int count=0;


    Car(String brand, FuelType fuelType, BodyType bodyType) {
        super(brand, fuelType);
        this.bodyType = bodyType;
        count++;
    }

    @Override
    void start() {
        System.out.println(brand + " car is starting.");
    }

    @Override
    void move() {
        System.out.println(brand + " car is moving.");
    }
}
