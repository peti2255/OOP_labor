package Lab3_2a;

import java.util.ArrayList;

public class Coustumer {

        private String firstName;
        private String lastName;
        public static final int MAX_ACCOUNTS = 10;
        private ArrayList<BankAccount> account = new ArrayList<BankAccount>();

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

        public void addAccount(BankAccount account) {
            if(this.account.size() < MAX_ACCOUNTS)
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
            for (BankAccount account  : this.account)
            {
                if(account.getAccountNumber() == accountNumber)
                {
                    return account = ;
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
