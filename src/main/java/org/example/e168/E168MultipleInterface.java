package org.example.e168;

public class E168MultipleInterface {

    interface Transaction {
        double processTransaction(double amount);
    }

    interface BankOperations extends Transaction {
        double deposit(double amount);

        double withdraw(double amount);

        double checkBalance();

        double processTransaction(double amount);

    }

    public static class BankAccount implements BankOperations {

        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public double setBalance(double amount) {
            balance = amount;
            return balance;
        }

        public double deposit(double amount) {
            balance = setBalance(getBalance() + amount);
            return balance;
        }

        public double withdraw(double amount) {
            if (amount <= getBalance()) {
                balance = setBalance(getBalance() - amount);
            }
            return balance;
        }

        public double processTransaction(double amount) {

            if (amount > 0) {
                balance = balance + deposit(amount);
                System.out.println("Transaction successful: Deposited " + amount);
            } else if (amount < 0 && -amount <= getBalance()) {
                balance = balance - withdraw(-amount);
                System.out.println("Transaction successful: Withdrew " + amount * -1);

            }
            if (-amount > getBalance()) {
                System.out.println("Transaction failed: Insufficient funds");
            }

            return balance;
        }

        public double checkBalance() {
            System.out.println("Current Balance: " + getBalance());
            return balance;
        }
    }


    public static void main(String[] args) {

        BankAccount b = new BankAccount(0);
        b.processTransaction(100);
        b.processTransaction(-50);
        b.checkBalance();
        b.processTransaction(-55);

    }
}
