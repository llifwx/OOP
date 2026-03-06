package Superclass_and_subclass;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>();

        Car car1 = new Car("Toyota", 2020, "Camry");
        Car car2 = new Car("Toyota", 2020, "Camry");
        Car car3 = new Car("BMW", 2022, "X5");
        Car car4 = new Car("Toyota", 2020, "Corolla");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println("Cars in HashSet:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nTotal unique cars: " + cars.size());
    }
}
