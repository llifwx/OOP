package Bank_Account_Systems;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double balance, double interestRate) {
        super(accNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount { " +
                "Account Number: " + getAccountNumber() +
                ", Balance: $" + getBalance() +
                ", Interest Rate: " + interestRate + "%" +
                " }";
    }
}
