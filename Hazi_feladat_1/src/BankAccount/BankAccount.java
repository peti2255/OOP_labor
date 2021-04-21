package BankAccount;

public class BankAccount {
  public final static String PREFIX = "OTP";
  public final  static int ACCOUNT_NUMBER_LENGTH = 10;
  private static final int numAccounts = 0;
  protected final String AccountNumber;
  protected double balance;

    public BankAccount(String accountNumber) {
        AccountNumber = accountNumber;
    }

    protected static String createAccountNumber() {
        return BankAccount.PREFIX + "0".repeat(ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length()) + numAccounts;
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
        return "Bank account: " + AccountNumber + "....."  + this.balance+" RON balance \n";
    }
}
