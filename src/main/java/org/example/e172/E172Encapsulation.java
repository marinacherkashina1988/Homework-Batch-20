package org.example.e172;

public class E172Encapsulation {

    public static class Customer {
        private long accountNumber;
        private String fullName;
        private String email;
        private double balance;

        public Customer(long accountNumber, String fullName, String email, double balance) {
            this.accountNumber = accountNumber;
            this.fullName = fullName;
            this.email = email;
            this.balance = balance;
        }

        public long getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }
    public static void main(String[] args){

        Customer c = new Customer (1234567890l, "Sarah Connor", "sarah.connor@example.com", 15000.0);
        System.out.println("Account Number: "+c.getAccountNumber());
        System.out.println("Full Name: "+c.getFullName());
        System.out.println("Email: "+c.getEmail());
        System.out.println("Account Balance: "+c.getBalance());
    }
}


