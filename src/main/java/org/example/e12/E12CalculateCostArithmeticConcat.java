package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {

        // Declare the float variables and assign values
        float item1 = 15.5f;
        float item2 = 23.0f;
        float item3 = 9.99f;
        float item4 = 27.49f;

        // Calculate the total cost
        float sum = item1 + item2 + item3 + item4;
        float totalCost = sum;
        // Calculate the average cost
        float averageCost = totalCost / 4;
        float result = averageCost;

        // Print the results
        System.out.println("The total cost is " + String.format("%.2f", totalCost));
        System.out.println("The average cost is " + String.format("%.3f", averageCost));
    }
}
