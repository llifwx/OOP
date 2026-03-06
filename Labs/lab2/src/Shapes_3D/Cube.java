package Shapes_3D;

public class Cube extends Shape3D{
    private double a;

    public Cube(double a){
        this.a = a;
    }

    @Override
    public double volume(){
        return a*a*a;
    }

    @Override
    public double surfaceArea(){
        return 6*a*a;
    }
}
