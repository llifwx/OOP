package Bank_Account_Systems;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                return;
            }
        }
    }

    public Account findAccount(int accNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accNumber) {
                return account;
            }
        }
        return null;
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}
