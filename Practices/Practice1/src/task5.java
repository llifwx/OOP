package lab1;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter interest: ");
        double interest = scanner.nextDouble();

        double new_balance = balance +  balance * (interest/100);

        System.out.print("New balance is: " + new_balance);
    }
}