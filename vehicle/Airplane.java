package vehicle;

public class Airplane extends Vehicle implements Flyable{
    AirplaneStatus status;
    static int count=0;

     Airplane(String brand, FuelType fuelType, AirplaneStatus status) {
        super(brand, fuelType);
        this.status = status;
        count++;
    }

    @Override
    void start() {
        System.out.println(brand + " airplane is starting.");
    }

    @Override
    void move() {
        System.out.println(brand + " airplane is flying.");
    }
    @Override
    public void takeOff(){
        System.out.println(brand + " airplane is TakeOff.");
    } @Override
    public void landing(){
        System.out.println(brand + " airplane is Landing.");
    }
}
