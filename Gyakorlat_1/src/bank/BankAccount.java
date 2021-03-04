package bank;

public class BankAccount {

    //tulajdonsagok, data - attributes (milyen?)
    // adatok biztonsaga -> egysegbezaras (encapsulation)
    private String accountNumber;
    private double balance;

    //Constructor- initializalas, lefoglalas
    //ugyan az a neve, mint az osztalynak
    // default konstructor
    //new kulcsszo meghivas
    public BankAccount(){

    }
    //viselkedes, methods (mit csinal?)
    public BankAccount(String szamlaszam)
    {

        this.accountNumber = szamlaszam;
        this.balance = 0;
    }

    //GETTERES


    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }

    //SETTER
    public void setAccountNumber(String newaccountNumber)
    {
        this.accountNumber = newaccountNumber;
    }
    // objektum allapota -> megjelenjtes
    // Account number: ..., balance:....
    @Override
    public String toString()
    {
        // lehet komlpexebb felepites
        return "Account number:" + accountNumber + ", Balance " + balance;
    }

   public void deposit (double balance)
    {
        if(balance > 0)
        {
            this.balance += balance;
        }
        else
        {
            System.out.println("Hibas osszeg");
        }

    }

    public boolean withdraw(double balance)
    {
        if(balance > 0 && this.balance-balance >= 0)
        {
            this.balance -=balance;
            return true;
        }
        else
            return false;
    }

}
