package org.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {

        // Step 1: Declare the float variables and assign values
        float item1 = 30.0f;
        float item2 = 20.0f;
        float item3 = 40.0f;

        // Step 2: Calculate the total cost
        float sum = item1 + item2 + item3;
        float totalCost = sum;

        // Step 3: Apply the discount
        float discountRate = 0.1f;
        float mult = totalCost * discountRate;
        float discountAmount = mult;

        float sub = totalCost - discountAmount;
        float finalPrice = sub;

        // Step 4: Print the results
        System.out.println("Total cost: $" + totalCost);
        System.out.println("Discount Amount: S" + discountAmount);
        System.out.println("FinalPrice: $" + finalPrice);
    }
}
