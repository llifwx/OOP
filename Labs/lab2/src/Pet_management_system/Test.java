package Pet_management_system;

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

        // Alice tries to take a dog
        alice.assignPet(rex); // should not be allowed

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("=== Initial Registry ===");
        System.out.println(registry);

        // John leaves cat with Alice
        john.leavePetWith(alice);

        System.out.println("=== After John leaves pet with Alice ===");
        System.out.println(registry);

        // John gets pet back
        john.retrievePetFrom(alice);

        System.out.println("=== After John retrieves pet back ===");
        System.out.println(registry);

        // Bob tries to leave dog with Alice
        bob.leavePetWith(alice); // should fail because Alice cannot take dogs

        // Bob leaves dog with John
        bob.leavePetWith(john);

        System.out.println("=== After Bob leaves dog with John ===");
        System.out.println(registry);

        // Extra pets
        alice.assignPet(kiwi);
        System.out.println("=== Alice gets a bird ===");
        System.out.println(registry);

        System.out.println("People with pets: " + registry.findPeopleWithPets());
        System.out.println("People without pets: " + registry.findPeopleWithoutPets());
    }
}
