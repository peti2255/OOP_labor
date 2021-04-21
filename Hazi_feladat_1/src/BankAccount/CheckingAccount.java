package BankAccount;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double value) {
        return super.withdraw(value);
    }

    @Override
    public String toString() {
        return super.toString() + "balance=" + balance +
                ", overdraftLimit=" + overdraftLimit ;
    }
}
