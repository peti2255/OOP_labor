package Lab5_1;

public class BankAccount {

    private final String AccountNumber;
    private double balance;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 5;
    private static int numAccount = 0;

    public BankAccount(String accountNumber) {
        AccountNumber = accountNumber;
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

//    private static String creatAccountNumber()
//    {
//        for(int i=0 ;i<ACCOUNT_NUMBER_LENGTH;i++)
//        {
//
//        }
//    }

    //Bank account :......with......RON balance
    @Override
    public String toString() {
        return "Bank account: " + this.AccountNumber +
                "....."  + this.balance+" RON balance \n";
    }
}
