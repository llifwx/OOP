package task2;

enum AccountType{
    SAVINGS,
    CREDIT,
}

class BankAccount{
    static int accountsCreated;
    static final double MIN_BALANCE = 0;
    private final int accountNumber;

    private double balance;
    private AccountType type;

    {
        accountsCreated++;
        if (accountsCreated <= 0) {
            throw new IllegalStateException("Accounts counter broken");
        }
    }

    public BankAccount(int accountNumber) {
        this(accountNumber, AccountType.SAVINGS);
    }

    public BankAccount(int accountNumber, AccountType type) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = MIN_BALANCE;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        this.balance += amount;
    }

    public void deposit(double amount, String comment) {
        if (amount <= 0) return;
        this.balance += amount;
        System.out.println("Deposit note: " + comment);
    }
}


public class task2 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1001);
        BankAccount a2 = new BankAccount(1002, AccountType.CREDIT);

        a1.deposit(500);
        a1.deposit(200, "Scholarship");

        a2.deposit(1000, "Salary");

        System.out.println("A1 accountNumber = " + a1.getAccountNumber());
        System.out.println("A2 accountNumber = " + a2.getAccountNumber());

        System.out.println("A1 balance = " + a1.getBalance());
        System.out.println("A2 balance = " + a2.getBalance());

        System.out.println("Accounts created = " + BankAccount.accountsCreated);

        System.out.println("MIN_BALANCE = " + BankAccount.MIN_BALANCE);
    }
}
