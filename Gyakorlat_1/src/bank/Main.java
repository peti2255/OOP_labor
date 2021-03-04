package bank;

public class Main {

    public static void main(String[] args) {
        // objektum, peldany, instance
    BankAccount account1 = new BankAccount("OTP0001");
    BankAccount account2 = new BankAccount("OTP0002");

        System.out.println(account1.getAccountNumber() + " " + account1.getBalance());
        System.out.println(account2.getAccountNumber()+ " " + account2.getBalance());

//        ezt nem szabad most
//        account1.setAccountNumber("BT001");
//        System.out.println(account1.setAccountNumber() + " " + account1.setBalance());

        System.out.println(account1);
        // ugyan az
        System.out.println(account1.toString());
        account1.deposit(500);
        System.out.println(account1);
        if(account1.withdraw(300))
        {
            System.out.println("Sikeres penzfelvetel");
        }
        else
        {
            System.out.println("Sikertelen penzfelvetel");
        }
    }
}
