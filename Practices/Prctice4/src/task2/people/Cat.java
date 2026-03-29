package task2.people;

import task2.interfaces.CanHavePizza;

public class Cat implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Cat eats pizza.");
    }
}
