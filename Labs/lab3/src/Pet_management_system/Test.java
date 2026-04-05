package Pet_management_system;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 21, "Mathematics");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal kiwi = new Bird("Kiwi", 2);
        Animal nemo = new Fish("Nemo", 1);

        john.assignPet(murka);
        bob.assignPet(rex);

        alice.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("=== Initial Registry ===");
        System.out.println(registry);

        john.leavePetWith(alice);

        System.out.println("=== After John leaves pet with Alice ===");
        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println("=== After John retrieves pet back ===");
        System.out.println(registry);

        bob.leavePetWith(alice);

        bob.leavePetWith(john);

        System.out.println("=== After Bob leaves dog with John ===");
        System.out.println(registry);

        alice.assignPet(kiwi);
        System.out.println("=== Alice gets a bird ===");
        System.out.println(registry);

        System.out.println("People with pets: " + registry.findPeopleWithPets());
        System.out.println("People without pets: " + registry.findPeopleWithoutPets());
        Collections.sort(registry.findPeopleWithPets());
    }
}
