package lab1;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of square's side:");
        int a = scanner.nextInt();

        System.out.println("Area: " + (a*a));
        System.out.println("Perimeter: " + (4*a));
        System.out.println("Length of diagonal: " + (sqrt(2)*a));
    }
}
