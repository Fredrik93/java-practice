package org.example.helpers;

public class MatrixHelpers
{

    public static void printMatrixInAPrettyWay(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("| ");
            for (int value : row) {
                System.out.printf("%4d ", value);
            }
            System.out.println("|");
        }
    }
}
