package org.example.e141;

public class E141AccessModifiers {

    static int maxValue(int[] numbers) {
        int maximum = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println(maxValue(new int[]{5, 9, 14, 22, 7}));
    }
}
