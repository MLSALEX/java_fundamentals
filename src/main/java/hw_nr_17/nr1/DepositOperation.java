package hw_nr_17.nr1;

public class DepositOperation implements Runnable{
    BankAccount bankAccount;
    int amount;

    public DepositOperation(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.deposit(amount);
    }
}
