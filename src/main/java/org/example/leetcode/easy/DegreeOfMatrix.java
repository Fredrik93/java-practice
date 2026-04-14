package org.example.leetcode.easy;

public class DegreeOfMatrix {
    public int[] findDegrees(int[][] matrix) {
        // loop over each array
        // increment number if there is a one
        // store number in new array at the same index
        int[] degrees = new int[matrix[0].length];
        int degree = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                if (num == 1) {
                    // inc
                    degree++;
                }
            }
            degrees[i] = degree;
            degree = 0;
        }
        return degrees;
    }
}
