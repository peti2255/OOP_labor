package BankAccount;

import javax.swing.plaf.ViewportUI;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Customer> customers;

    public Bank(String name)
    {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public Customer getCustomer(int customerId)
    {
        for (Customer c : this.customers)
            if (c.getId() == customerId)
                return c;

        return null;
    }
    private void printCustomer(PrintStream ps)
    {
        ps.println("ID, Firstname, Lastname, Number of bank account");
        for (Customer customer : customers){
            ps.println(customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getAccountNumber());
        }
    }
    public void printCustomerToStdout()
    {
        printCustomer(System.out);
    }
    public void printCustomersToFile(String filename){
        try {
            printCustomer(new PrintStream(filename));
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}