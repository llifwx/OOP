package task1.abstract2;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance = " + balance);
        }
    }

    public void showBalance() {
        System.out.println("Account " + accountNumber + ", balance = " + balance);
    }

    public abstract void withdraw(double amount);
}
