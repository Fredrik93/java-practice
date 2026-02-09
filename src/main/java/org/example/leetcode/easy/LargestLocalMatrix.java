package org.example.leetcode.easy;

import org.example.helpers.MatrixHelpers;

public class LargestLocalMatrix
{

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {

                int max = 0;

                // check the 3x3 submatrix
                for (int r = i; r <= i + 2; r++) {
                    for (int c = j; c <= j + 2; c++) {
                        max = Math.max(max, grid[r][c]);
                    }
                }

                result[i][j] = max;
            }
        }

        return result;
    }
}
