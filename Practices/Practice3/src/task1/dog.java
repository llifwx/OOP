package task1;


class Dog extends animal{
    public Dog() {
        super();
        System.out.println("Dog created");
    }

    public Dog(String name, int age){
        super(name, age);
        System.out.println("Dog with parameters created");
    }

    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }

    public void eat(String food){
        System.out.println("Dog eats " + food);
    }
}

