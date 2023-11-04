package hw_nr_17.nr1;

public class WithdrawOperation implements Runnable {
    BankAccount bankAccount;
    int amount;

    public WithdrawOperation(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
