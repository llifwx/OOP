package task1;
import java.util.Scanner;

public class Analyzer {
    public static void main(){
        Data data = new Data();
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter your number! (Type Q to quit): ");
            input = scanner.nextLine();
            try{
                if (input.equals("Q")) break;
                double donum = Double.parseDouble(input);
                data.Add(donum);
            } catch (NumberFormatException e){
                System.err.println("Invalid string format: " + e.getMessage());
            }
        }

        System.out.println("Average is " + data.Avg());
        System.out.println("Max is " + data.Max());
    }
}
