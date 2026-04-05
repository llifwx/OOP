package task1.interface1;

public class Main {
    public static void main(String[] args) {
        Payable[] payables = {
                new FullTimeEmployee("Alice", 3000),
                new Freelancer("Bob", 40, 25),
                new Invoice("Laptop", 2, 500)
        };

        for (Payable p : payables) {
            System.out.println("Payment = " + p.calculatePayment());
        }
    }
}
