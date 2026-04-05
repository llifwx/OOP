package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Bird bird = new Bird("Eagle");

        car.move();

        bird.move();
        bird.fly();
    }
}
