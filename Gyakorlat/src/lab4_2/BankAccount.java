package lab4_2;

public class BankAccount {
    private final String AccountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.AccountNumber = accountNumber;

    }

    public String getAccountNumber()
    {
        return AccountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
    public  void deposit(double value)
    {
        if(value >0)
        {
            this.balance += value;
        }
    }

    public boolean withdraw(double value)
    {
        if(value > 0 && value <= this.balance)
        {
            this.balance -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank account: " + this.AccountNumber + "....."  + this.balance+" RON balance \n";
    }
}
