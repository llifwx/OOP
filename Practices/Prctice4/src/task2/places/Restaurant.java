package task2.places;

import task2.interfaces.CanHavePizza;
import task2.people.Person;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println("Processing payment.");
        }

        return true;
    }
}
