package task2;

public class Car implements Moveable{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println(brand + " car is moving on the road.");
    }
}
