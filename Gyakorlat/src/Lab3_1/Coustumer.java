package Lab3_1;

public class Coustumer {

    private String firstName;
    private String lastName;
    BankAccount account;

    public Coustumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount ()
    {
        return ;
    }

    @Override
    public String toString() {
        String result = this.firstName+" "+this.lastName;
        if(this.account == null) {
            result += " has no account";
        }
        else
           result += " has a "+this.account;
        return result;
    }
}
