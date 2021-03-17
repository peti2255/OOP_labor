package Lab3_2;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Coustumer coustumer1 = new Coustumer("John", "Black");
        Coustumer coustumer2 = new Coustumer("Mary", "White");
        Random rand = new Random();
        for (int i = 0; i <= 5; i++) {
            coustumer1.addAccount(new BankAccount("OTP" + i));
        }

        for (int i = 0; i <= 9; i++) {
            coustumer2.addAccount(new BankAccount("OTP" + i));
        }

        System.out.println(coustumer1);
        System.out.println(coustumer2);
        for (int i = 0; i <= 5; i++) {
            if (coustumer1.getAccount("OTP" + i) != null)
            {
                System.out.println("add");
                coustumer1.getAccount("OTP" + i).deposit(rand.nextDouble()* 100);
            }

        }
        for (int i = 0; i <= 9; i++) {
            if (coustumer2.getAccount("OTP" + i) != null)
                coustumer2.getAccount("OTP" + i).deposit(rand.nextDouble()* 100);
        }
        System.out.println(coustumer1);
        System.out.println(coustumer2);
    }

}
