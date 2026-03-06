package Bank_Account_Systems;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1001, 1000.0, 5.0);
        SavingsAccount s2 = new SavingsAccount(1002, 2000.0, 3.5);

        CheckingAccount c1 = new CheckingAccount(2001, 500.0);
        CheckingAccount c2 = new CheckingAccount(2002, 800.0);

        bank.openAccount(s1);
        bank.openAccount(s2);
        bank.openAccount(c1);
        bank.openAccount(c2);

        System.out.println("=== Initial Accounts ===");
        bank.printAccounts();

        c1.deposit(100);
        c1.withdraw(50);
        c1.deposit(30);
        c1.withdraw(20);
        c1.deposit(10);

        s1.transfer(200, c2);

        System.out.println("\n=== Before Update ===");
        bank.printAccounts();

        bank.update();

        System.out.println("\n=== After Update ===");
        bank.printAccounts();

        bank.closeAccount(1002);

        System.out.println("\n=== After Closing Account 1002 ===");
        bank.printAccounts();
    }
}
