package Shapes_3D;

public class Test {
    static void main(String[] args){
        Cylinder cyl = new Cylinder(3, 3);
        Sphere sphere = new Sphere(4);
        Cube cube = new Cube(6);

        System.out.println("Cylinder volume: " + cyl.volume());;
        System.out.println("Cylinder surface area: " + cyl.surfaceArea());
        System.out.println("Sphere surface area: " + sphere.surfaceArea());
        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());
    }
}
