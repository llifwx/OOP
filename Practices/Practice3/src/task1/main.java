package task1;

public class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.eat();

        System.out.println("------------");

        Dog dog2 = new Dog("Buddy", 3);
        dog2.makeSound();
        dog2.eat();
        dog2.eat("meat");
    }
}

