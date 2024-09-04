package org.example.e132;

public class E132StaticKeyword {

    public static int[][] reduce10(int[][] array) {
        int[][] newArray = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[i][j] - 10;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] newArray = reduce10(new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        });

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

