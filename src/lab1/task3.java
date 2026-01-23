package lab1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        int a = scanner.nextInt();

        if (a >= 95) {
            System.out.println("A");
        }
        if (90 <= a && a < 95) {
            System.out.println("A-");
        }
        if (a < 90 && a >= 85) {
            System.out.println("B+");
        }
        if (a < 85 && a >= 80) {
            System.out.println("B");
        }
        if (a < 80 && a >= 75) {
            System.out.println("B-");
        }
        if (a < 75 && a >= 70) {
            System.out.println("C+");
        }
        if (a < 70 && a >= 65) {
            System.out.println("C");
        }
        if (a < 65 && a >= 60) {
            System.out.println("C-");
        }
        if (a < 60 && a >= 55) {
            System.out.println("D+");
        }
        if (a < 55 && a >= 50) {
            System.out.println("D");
        }
        if (a < 50) {
            System.out.println(("F"));
        }
    }
}
