package bonus_hw_1;

public class WithdrawalTransaction implements Transaction {
    private final double withdrawalAmount;
    private final BankAccount bankAccount;

    public WithdrawalTransaction(Double withdrawalAmount, BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        if(withdrawalAmount<0)
            this.withdrawalAmount = withdrawalAmount *-1;
        else
            this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void process() throws Exception {
        double bufferAmount = bankAccount.getAccountBalance();
        if(bufferAmount - withdrawalAmount<0)
            throw new Exception("Insufficient funds in bank account: " + bankAccount.getAccountNr());
        else bankAccount.setAccountBalance(bufferAmount-withdrawalAmount);
    }
}
