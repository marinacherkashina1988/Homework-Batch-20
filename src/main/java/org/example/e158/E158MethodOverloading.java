package org.example.e158;

public class E158MethodOverloading {

    public static class LoanPaymentCalculator {
        double payment = 0;

        public double calculatePayment(double loanAmount, double interestRate) {
            payment = (loanAmount * (1 + interestRate / 100) / 12);
            return payment;
        }

        public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths) {
            payment = ((loanAmount * (1 + interestRate / 100)) / numberOfMonths);
            return payment;
        }

        public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment) {
            payment = ((loanAmount - downPayment) * (1 + interestRate / 100) / numberOfMonths);
            return payment;
        }
    }

    public static void main(String[] args) {

        LoanPaymentCalculator obj = new LoanPaymentCalculator();
        System.out.println(String.format("%.2f", obj.calculatePayment(10000, 5)));
        System.out.println(String.format("%.2f", obj.calculatePayment(10000, 5, 24)));
        System.out.println(String.format("%.2f", obj.calculatePayment(10000, 5, 24, 2000)));
    }
}

