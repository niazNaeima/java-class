package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Airport airport = new Airport(7, 2, 9);

        Car car1 = new Car("Toyota", FuelType.GASOLINE, BodyType.COUPE);
        Car car2 = new Car("Honda", FuelType.DIESEL, BodyType.SEDAN);
        Car car3 = new Car("Kia", FuelType.KEROSENE, BodyType.SUV);
        airport.parking.parkCar(car1);
        airport.parking.parkCar(car2);
        airport.parking.parkCar(car3);

        Airplane airplane1 = new Airplane("Boeing", FuelType.GASOLINE, AirplaneStatus.OnTime);
        Airplane airplane2 = new Airplane("Airbus", FuelType.GASOLINE, AirplaneStatus.Delayed);
        airport.addAirplane(airplane1);
        airport.addAirplane(airplane2);

        Helicopter helicopter1 = new Helicopter("hell1", FuelType.GASOLINE);
        Helicopter helicopter2 = new Helicopter("hell2", FuelType.GASOLINE);
        Helicopter helicopter3 = new Helicopter("hell3", FuelType.GASOLINE);
        airport.addHelicopter(helicopter1);
        airport.addHelicopter(helicopter2);
        airport.addHelicopter(helicopter3);

        System.out.println(airport.helicopterIndex + " Helicopters and "+airport.airplaneIndex +" Airplanes and "+ airport.parking.index+" Cars "+ "Are Parked In vehicle.Airport.");
    }
}
