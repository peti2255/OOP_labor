package Lab3_2;

public class Coustumer {

    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount account[] = new BankAccount[MAX_ACCOUNTS];

    public Coustumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }
    public int getNumAccounts()
    {
        return this.numAccounts;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(BankAccount account) {
        if(this.numAccounts < MAX_ACCOUNTS)
        {
            this.account[numAccounts] = account;
            this.numAccounts++;
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
       for (int i = 0;i < numAccounts; i++)
       {
           if(this.account[i].getAccountNumber().equals(accountNumber))
           {
               this.account[i] = null;
               for (int j=i;j < numAccounts-1; ++j)
               {
                   this.account[j]  = this.account[j+1];
               }
               numAccounts--;
               return;
           }


       }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i < numAccounts; ++i){
            result.append( "\t" + account[i].toString() +"\n");
        }
        return result.toString();
    }
}