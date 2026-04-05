package task1.abstract2;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("SA101", 1000);
        BankAccount a2 = new CheckingAccount("CA202", 500, 300);

        a1.deposit(200);
        a1.withdraw(700);
        a1.showBalance();

        a2.withdraw(700);
        a2.showBalance();
    }
}
