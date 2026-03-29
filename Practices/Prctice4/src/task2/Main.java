package task2;

import task2.people.Cat;
import task2.people.Student;
import task2.places.Restaurant;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Student student = new Student();
        Restaurant restaurant = new Restaurant();

        System.out.println("Serving cat:");
        restaurant.servePizza(cat);

        System.out.println();

        System.out.println("Serving student:");
        restaurant.servePizza(student);

        System.out.println();

        student.retakeExam();
        student.dance();
        student.move();
    }
}
