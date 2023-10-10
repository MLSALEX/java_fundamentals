package bonus_hw_1;

public class BankAccount {
    private static int accountCount;
    private final int accountNr;
    private final String accountHolderName;
    private double accountBalance;
    private String IBAN = "";


    public BankAccount(String accountHolderName, String countryCode,
                       String bankAbbreviation) throws Exception {
        accountCount++;
        this.accountNr = accountCount;
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0d;
        setIBANWithValidation(countryCode,bankAbbreviation);
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public String getUserName() {
        return accountHolderName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private void setIBANWithValidation(String countryCode,
                                       String bankAbbreviation) throws  Exception{
        if (countryCode.length() !=2 || bankAbbreviation.length() != 4)
            throw new Exception("Invalid Parameters"); // validation

        String accountNr = String.valueOf(getAccountNr());
        int accountNrLength = accountNr.length();
        this.IBAN += countryCode; // к IBAN " " добавляем countryCode из 2 симв
        this.IBAN += bankAbbreviation; // еше доб. bankAbb из 4 симв

        for(int i = 0; i != (23 - accountNrLength -6); i ++){
            this.IBAN += "0";
        }
        this.IBAN+=accountNr;
    }
}
