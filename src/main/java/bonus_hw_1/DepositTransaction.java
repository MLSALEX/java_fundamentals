package bonus_hw_1;
public class DepositTransaction implements Transaction {
    private BankAccount bankAccount;

    private double depositSum;

    public DepositTransaction(BankAccount bankAccount,
                              double depositSum) throws Exception {
        this.bankAccount = bankAccount;
        if(depositSum<0)
            throw new Exception("Deposit sum is a negative number");
        else
            this.depositSum = depositSum;
    }

    @Override
    public void process() {
        double bufferSum = bankAccount.getAccountBalance();
        bankAccount.setAccountBalance(bufferSum+depositSum);
    }
}
