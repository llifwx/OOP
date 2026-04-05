package task1.abstract1;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 5);
        Shape s2 = new Rectangle("Blue", 4, 6);

        s1.displayColor();
        System.out.println("Area = " + s1.area());

        s2.displayColor();
        System.out.println("Area = " + s2.area());
    }
}
