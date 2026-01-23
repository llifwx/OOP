package lab1;

import java.util.Scanner;
import java.lang.Math;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be 0");
            return;
        }

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double d = b*b - 4*a*c;

        if (d < 0) {
            System.out.println("Error: discriminant is negative");
            return;
        }
        else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("One root: x = " + x);
        }
        else{
            double sqrtD = Math.sqrt(d);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
