package hw_nr_17.nr1;

import hw_nr_17.Constants;

public class BankAccount{
    private static int balance;
    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        System.out.println("Initial balance is: " + balance);
        return balance;
    }

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println(Constants.ANSI_CYAN + "Balance after deposit: " + balance);
    }
    public synchronized void withdraw(int amount){
        if (balance - amount <0) {
            throw new IllegalArgumentException("Not enough money");
        }
        balance -= amount;
        System.out.println(Constants.ANSI_PURPLE + "Balance after withdrawal: " + balance);
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(120);
        WithdrawOperation withdrawOp = new WithdrawOperation(b1,130);
        DepositOperation depositOp = new DepositOperation(b1,60);

        Thread t1 = new Thread(withdrawOp);
        Thread t2 = new Thread(depositOp);

        t1.start();
        t2.start();
        b1.getBalance();
    }
}