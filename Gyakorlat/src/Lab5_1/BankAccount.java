package Lab5_1;

public class BankAccount {

    private final String AccountNumber;
    private double balance;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 8;
    private static int numAccount = 0;

    public BankAccount() {
        numAccount++;
        AccountNumber = creatAccountNumber();
    }

    /**
     * Generaljon, epites fel egy egyedi szamlaszamot
     * @return egy egyedi bankszamla szam
     */
    private String creatAccountNumber() {
        //PREFIX, ACCOUNT_LENGHT, numACCOUNT
        //PREFIC......numAccount
        return BankAccount.PREFIX + "0".repeat(ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccount).length()) + numAccount;

    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double value) {
        if(value > 0) {
            this.balance += value;
        }
    }

    public boolean withdraw(double value) {
        if(value > 0 && value <= this.balance) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    //Bank account :......with......RON balance
    @Override
    public String toString() {
        return "Bank account: " + this.AccountNumber +
                "....."  + this.balance+" RON balance \n";
    }
}
