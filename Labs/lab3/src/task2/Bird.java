package task2;

public class Bird implements Flyable{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on the ground.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }
}
