package Pet_management_system;


import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> findPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public Person findByName(String name) {
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}