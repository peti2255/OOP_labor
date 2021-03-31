package Lab5_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer custumer1 = new Customer("Felix","Black");
        Customer customer2= new Customer("Johnny","Test");
        System.out.println(custumer1);
        System.out.println(customer2);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i=0;i< 2;i++)
        {
            customer2.addAccount(new BankAccount());
        }
        for (int i=0;i< 2;i++)
        {
            custumer1.addAccount(new BankAccount());
        }

        for (String  s : customer2.getAccountNumber())
        {
            System.out.println(s);
        }

    }
}
