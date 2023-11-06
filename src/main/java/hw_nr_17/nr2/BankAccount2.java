package hw_nr_17.nr2;

import hw_nr_17.Constants;

public class BankAccount2 {
    private int balance;

    public BankAccount2(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount){
        balance += amount;
        notifyAll();
    }
    public synchronized  void withdraw (int amount) throws InterruptedException {
        while (balance<amount){
            wait();
        }
        balance -= amount;
    }

    public synchronized void transfer(BankAccount2 beneficiary, int amount) throws InterruptedException {
        while(balance<amount){
            wait();
        }
        withdraw(amount);
        beneficiary.deposit(amount);
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount2 a1 = new BankAccount2(150);
        BankAccount2 a2 = new BankAccount2(60);
        Thread t1 = new Thread(()->{
            try{
                a1.transfer(a2,100);
                System.out.println(Constants.ANSI_CYAN + "Balance in bank account a1 after transaction is: " + a1.getBalance() +
                        ", in bank account a2 is :" + a2.getBalance());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try{
                a2.transfer(a1,20);
                System.out.println(Constants.ANSI_PURPLE + "Balance in bank account a2 after transaction is: " + a2.getBalance() +
                        ", in bank account a1 is :" + a1.getBalance());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        System.out.println("Initial balance: in a1 is: " + a1.getBalance() + ", in a2: " + a2.getBalance());

    }
}
