package task1.abstract2;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount);
        } else {
            System.out.println("Insufficient funds in savings account");
        }
    }
}
