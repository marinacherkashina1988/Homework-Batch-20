package org.example.e157;

public class E157MethodOverloading {

    public static class TransactionCalculator {

        int result = 0;

        public int calculateProfit(int totalRevenue, int transaction1) {
            result = totalRevenue-transaction1;
            return result;
        }

        public int calculateProfit(int totalRevenue, int transaction1, int transaction2) {
            result = totalRevenue-(transaction1 + transaction2);
            return result;
        }

        public int calculateProfit(int totalRevenue, int transaction1, int transaction2, int transaction3) {
            result = totalRevenue-(transaction1 + transaction2 + transaction3);
            return result;
        }
    }

    public static void main(String[] args) {

        TransactionCalculator obj = new TransactionCalculator();
        System.out.println(obj.calculateProfit(100, 20, 30, 10));
        System.out.println(obj.calculateProfit(80, 30, 20));
        System.out.println(obj.calculateProfit(50, 30));
    }
}



