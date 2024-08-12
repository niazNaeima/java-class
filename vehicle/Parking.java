package vehicle;

public class Parking {
    Car[] cars;
    int capacity;
    int index;

    Parking(int capacity) {
        this.capacity = capacity;
        cars = new Car[capacity];
        index = 0;
    }

    void parkCar(Car car) {
        if (index < capacity) {
            cars[index] = car;
            index++;
            System.out.println(car.brand + " car is parked.");
        } else {
            System.out.println("vehicle.Parking is full.");
        }
    }
}
