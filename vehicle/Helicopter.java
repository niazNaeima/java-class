package vehicle;

public class Helicopter extends Vehicle implements VerticallyFlyable{
    static int count=0;
    Helicopter(String brand, FuelType fuelType) {
        super(brand, fuelType);
        count++;
    }

    @Override
    void start() {
        System.out.println(brand + " helicopter is starting.");
    }

    @Override
    void move() {
        System.out.println(brand + " helicopter is flying.");
    }
    @Override
    public void takeOff(){
        System.out.println(brand + " helicopter is TakeOff.");
    } @Override
    public void landing(){
        System.out.println(brand + " helicopter is Landing.");
    }
    public void verticallyFly(){
        System.out.println(brand + " helicopter is flying vertically.");
    }
}
