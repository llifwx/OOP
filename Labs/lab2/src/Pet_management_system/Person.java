package Pet_management_system;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void assignPet(Animal pet) {
        if (pet == null) {
            System.out.println(name + " cannot be assigned a null pet.");
            return;
        }

        if (!canTakePet(pet)) {
            System.out.println(name + " cannot take this pet: " + pet.getClass().getSimpleName());
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    protected boolean canTakePet(Animal pet) {
        return true;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!this.hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " already has a pet.");
            return;
        }

        Animal temp = this.pet;

        if (!caretaker.canTakePet(temp)) {
            System.out.println(caretaker.getName() + " cannot take this pet: " + temp.getClass().getSimpleName());
            return;
        }

        caretaker.assignPet(temp);
        this.removePet();

        System.out.println(name + " left pet " + temp.getName() + " with " + caretaker.getName());
    }

    public void retrievePetFrom(Person caretaker) {
        if (this.hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }

        if (caretaker == null || !caretaker.hasPet()) {
            System.out.println("No pet to retrieve from caretaker.");
            return;
        }

        Animal temp = caretaker.getPet();

        if (!this.canTakePet(temp)) {
            System.out.println(name + " cannot retrieve this pet.");
            return;
        }

        this.assignPet(temp);
        caretaker.removePet();

        System.out.println(name + " retrieved pet " + temp.getName() + " from " + caretaker.getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + getOccupation() + '\'' +
                ", pet=" + (pet == null ? "none" : pet.toString()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}