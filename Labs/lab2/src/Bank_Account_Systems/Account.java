package Bank_Account_Systems;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public Account(int a, double balance) {
        this.accNumber = a;
        this.balance = balance;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accNumber + ", Balance: $" + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}