package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {

        // Assign values to daily expenses
        double morningExpense = 5.05;
        double afternoonExpense = 12.15;
        double eveningExpense = 59.05;

        // Calculate total expense
        double sum = morningExpense + afternoonExpense + eveningExpense;
        double totalExpense = sum;

        // Define a budget
        double budget = 100.0;
        System.out.println("Your total daily expense is: " + totalExpense);
        // Check if within budget
        if (totalExpense < 100) {
            System.out.println("You are within the budget.");
        } else {
            System.out.println("You are over the budget.");
        }

    }
}
