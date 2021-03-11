package Lab3_1;

import java.beans.Customizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // BankAccount account1 = new BankAccount("OTP0001");
       // System.out.println(account1);
        System.out.println();
        Coustumer me = new Coustumer("Peter-Erszeny","Erszeny");
        System.out.println(me);

        me.setAccount(new BankAccount("OTP0001"));
        System.out.println(me);

        //        Create a customer with the name John BLACK.
        Coustumer customerJB = new Coustumer("John","Black");
        //●         Print the customer using its toString method.
        System.out.println(customerJB);
        //● Set the account of this customer to an account with accountNumber OTP00001.
        customerJB.setAccount(new BankAccount("OTP00001"));
        //● Print the customer to the standard output.
        System.out.println(customerJB);
        //● Deposit 1000 EUR in the customer bank account.
        customerJB.getAccount().deposit(1000);
        System.out.println(customerJB);
        //● Perform other operations with the customer account.
        System.out.println("Amount of money: ");
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();

        if( customerJB.getAccount().withdraw(money))
        {
            System.out.println("Successfull transaction");
        }
        else
        {
            System.out.println("Unsuccessfull transaction");
        }
        System.out.println(customerJB);
        //● Create another customer with the name Mary WHITE.
        Coustumer coustumerMW = new Coustumer("Mary","White");
        //● Set the account of Mary to an account with accountNumber OTP00002.
        coustumerMW.setAccount(new BankAccount("OTP0002"));
        //● Print Mary’s data to the standard output.
        System.out.println(coustumerMW);
        //● Perform some operations with Mary’s account.
        if( customerJB.getAccount().withdraw(money))
        {
            System.out.println("Successfull transaction");
        }
        else
        {
            System.out.println("Unsuccessfull transaction");
        }
        //● Close Mary’s account.
        coustumerMW.closeAccount();
        //● Print Mary’s data to the standard output.
        System.out.println(coustumerMW);
        //● John decides to marry Mary and he wants to share his bank account with Mary. Help
            coustumerMW.setLastName("Black");
        //● Print John’s and Mary’s data to the standard output.
        coustumerMW.setAccount(customerJB.account);
        System.out.println(coustumerMW);
    }
}
