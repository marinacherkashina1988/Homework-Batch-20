package org.example.e151;

public class E151Inheritance {

    public static class BankAccount {
        private String accountHolderName;
        private double balance;
        private String accountNumber;

        private BankAccount(String accountHolderName, double balance, String accountNumber) {
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double deposit(double amount) {
            setBalance(getBalance()+amount);
            return balance;
        }

        public double withdraw(double amount) {
            if (balance >= amount) {
                setBalance(getBalance()-amount);
            } else {
                System.out.println("Insufficient balance");
            }
            return balance;
        }

        public void printAccountInfo() {
            System.out.println("Account Holder: " + getAccountHolderName());
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Balance: " + getBalance());
        }

    }

    public static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
            super(accountHolderName, balance, accountNumber);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void applyInterest() {
            setBalance(getBalance() + (getBalance() * getInterestRate()));
        }
    }

    public static class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
            super(accountHolderName, balance, accountNumber);
            this.overdraftLimit = overdraftLimit;
        }

        public double getOverdraftLimit() {
            overdraftLimit=getBalance()*overdraftLimit;
            return overdraftLimit;
        }

        public double withdraw(double amount) {
            if ( amount <= getBalance() + getOverdraftLimit()) {
                setBalance(getBalance() - amount);
            } else {
                System.out.println("Insufficient balance");
            }
            return amount;
        }
    }

    public static void main(String[] args) {

        SavingsAccount saving = new SavingsAccount("John Doe", 1000, "123456789", 0.05);
        saving.deposit(50);
        saving.withdraw(50);
        saving.applyInterest();
        saving.printAccountInfo();
        System.out.println();

        CheckingAccount checking = new CheckingAccount("Jane Smith", 950, "987654321", .05);
        checking.deposit(50);
        checking.withdraw(1050);
        checking.getOverdraftLimit();
        checking.printAccountInfo();

    }
}
