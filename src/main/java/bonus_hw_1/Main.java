package bonus_hw_1;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank1 = new Bank("MAIB","","");
        bank1.createNewAccount("Alexei Soloviov");
        bank1.createNewAccount("Dmitri Turcan");
        bank1.createNewAccount("Stepan Ciobanu");

        bank1.depositMoney(1, 20);
        bank1.depositMoney(2, 30);
        bank1.depositMoney(3,15);

        bank1.withdrawMoney(1, 10);
        bank1.printAllAccountsAndAmounts();
        //AccountNumber: 1 | Account Holder Name:Alexei Soloviov | Account Balance: 10.0
        //AccountNumber: 2 | Account Holder Name:Dmitri Turcan | Account Balance: 30.0
        //AccountNumber: 3 | Account Holder Name:Stepan Ciobanu | Account Balance: 15.0

        bank1.withdrawMoney(1, -5);
        bank1.printAllAccountsAndAmounts();
        //AccountNumber: 1 | Account Holder Name:Alexei Soloviov | Account Balance: 5.0 ..
        bank1.transactMoney(2,1, 9.6);
        System.out.println("------------");
        bank1.printAllAccountsAndAmounts();
        //------------
        //AccountNumber: 1 	| .. | Account Balance: 14.6 	| IBAN: MDMAIB00000000000000001
        //AccountNumber: 2 	| .. | Account Balance: 20.4 	| IBAN: MDMAIB00000000000000002

    }
}
