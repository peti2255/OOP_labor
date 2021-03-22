package lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private  String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void addAccount(BankAccount accounts)
    {
            this.accounts.add(accounts);
    }
    public BankAccount getAccounts(String accountNumber)
    {
        for (BankAccount account : this.accounts)
        {
            if(account != null && account.getAccountNumber().equals(accountNumber))
            {
                return account;
            }
        }
        return null;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount (String accountNumber)
    {
        for (int i = 0;i < accounts.size(); i++)
        {
            this.accounts.remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(this.firstName + ' ' + this.lastName + " accounts:\n");
        for (BankAccount a : this.accounts)
        result.append(a.toString());
        return result.toString();
    }
}
