package task1;

class animal {
    protected String name;
    protected int age;

    public animal() {
        System.out.println("Animal created");
    }

    public animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}
