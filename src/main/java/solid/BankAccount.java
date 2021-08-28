package solid;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.transferMoney(new BankAccount(), 100);
    }
}

public class BankAccount {
    public void transferMoney(BankAccount targetAccount, int amount) {
        //TODO => transfer amount of money to targetAccount
    }
}
