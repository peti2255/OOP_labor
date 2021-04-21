package BankAccount;

    public class SavingsAccount extends BankAccount {

        private double interestRate;


        public SavingsAccount(String accountNumber,double interestRate) {
            super(accountNumber);
            this.interestRate = interestRate;

        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        void addInterest()
        {
            this.interestRate = this.interestRate * balance;
        }

        @Override
        public String toString() {
            StringBuffer buffer = new StringBuffer();
            buffer.append(super.toString());
            buffer.append("SavingAccounts: ").append("interest: ").append(this.interestRate).append("\t");
            addInterest();
            buffer.append("interestRate: ").append(this.interestRate).append("\n").append("\n");
            return buffer.toString();
        }
    }
