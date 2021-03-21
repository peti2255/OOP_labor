package Lab3_2a;

public class main {
    public static void main(String[] args) {
        Coustumer me = new Coustumer("Peter ","Erszeny");
        for (int i = 0; i <= 5; i++) {
            me.addAccount(new BankAccount("OTP"+i));
        }
        for (int i = 0; i <= 5; i++) {
            if (me.getAccount("OTP" + i) != null)
            {
                me.getAccount("OTP" + i).deposit(i*100);
            }

        }
        System.out.println(me);
    }
}
