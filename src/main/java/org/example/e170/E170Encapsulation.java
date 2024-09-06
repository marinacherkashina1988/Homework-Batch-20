package org.example.e170;

public class E170Encapsulation {

    private static class Customer{

        private String customerName;
        private int customerAge;

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public int getCustomerAge() {
            return customerAge;
        }

        public void setCustomerAge(int customerAge) {
            this.customerAge = customerAge;
        }
    }

    public static class StoreManagement{}
        public static void main(String[] args) {
            Customer c = new Customer ();
            c.setCustomerName("Mario");
            c.setCustomerAge(32);
            System.out.println("Customer Name: "+c.getCustomerName());
            System.out.println("Customer Age: "+c.getCustomerAge());
        }
    }






