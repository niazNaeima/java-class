package vehicle;

public class Airport {
    Airplane[] airplanes;
    Helicopter[] helicopters;
    Parking parking;
    int airplaneIndex=0;
    int helicopterIndex=0;

    Airport(int airplaneCapacity, int helicopterCapacity, int parkingCapacity) {
        airplanes = new Airplane[airplaneCapacity];
        helicopters = new Helicopter[helicopterCapacity];
        parking = new Parking(parkingCapacity);
    }

    void addAirplane(Airplane airplane) {
        if (airplaneIndex < airplanes.length) {
            airplanes[airplaneIndex] = airplane;
            airplaneIndex++;
            System.out.println(airplane.brand + " airplane is added to the airport.");
        } else {
            System.out.println("No space for more airplanes.");
        }
    }

    void addHelicopter(Helicopter helicopter) {
        if (helicopterIndex < helicopters.length) {
            helicopters[helicopterIndex] = helicopter;
            helicopterIndex++;
            System.out.println(helicopter.brand + " helicopter is added to the airport.");
        } else {
            System.out.println("No space for more helicopters.");
        }
    }
}
