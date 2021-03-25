package Lab5_1;

import java.beans.Customizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coustumer custumer1 = new Coustumer("Felix","Black");
        Coustumer customer2= new Coustumer("Johnny","Test");
        System.out.println(custumer1);
        System.out.println(customer2);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i=0;i< 150;i++)
        {
            accounts.add(new BankAccount());
        }

        for(BankAccount c : accounts)
        {
            System.out.println(c);
        }
    }
}
