package task5;

public class Person {
    private final Gender gender;
    private final String name;

    public Person(Gender gender) {
        this(gender, "");
    }

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString(){
        return gender == Gender.BOY ? "B" : "G";
    }
}
