package Lab5_1;


import java.util.ArrayList;

public class Coustumer {

    private static int numCustomers = 0;
    private final int id;
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private ArrayList<BankAccount> account = new ArrayList<>();

    public Coustumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numCustomers++;
        this.id = numCustomers;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(BankAccount account) {
        if(this.account.size() < MAX_ACCOUNTS)
        {
            this.account.add(account);
        }
    }
    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account  : this.account)
        {
            if(account != null  && account.getAccountNumber().equals(accountNumber))
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
        for (int i = 0;i < account.size(); i++)
        {
            this.account.remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(this.firstName + ' ' + this.lastName +" (ID: "+this.id + " ) accounts:\n");
        result.append(this.account.toString());
        return result.toString();
    }
}
