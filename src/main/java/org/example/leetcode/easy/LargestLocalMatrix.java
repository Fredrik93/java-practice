package org.example.leetcode.easy;

import org.example.helpers.MatrixHelpers;

public class LargestLocalMatrix
{
    public int[][] largestLocal(int[][] grid)
    {
        MatrixHelpers.printMatrixInAPrettyWay(grid);

        // from starting point you should travel i + 1 so one to the right and then j + 1 so one down to reach the middle
        // check all elements that are at most i+1 or j + 1 steps away, that way you check the closest neighbours
        int lengthToIterate = grid[0].length * 2;
        // for test 1 should be four elemented 6,2,2,6 (the middlemost elements)
        int gridLength = (int) Math.ceil(grid.length / 2.0);

        int [][] highestNumbersInMatrix = new int[gridLength][gridLength];

        int k = 0;
        // gte a list of middleelements. not sure if i need this but i could verify that im getting the mid elements i need at least
        for(int i = 0; i < gridLength; i++)
        {

            for(int j = 0; j < gridLength; j++)
            {
                int highestNumberCloseToTheMiddle =0;

                // in here we want to check surrounding elements from the middlelement
                // check upper row
                highestNumberCloseToTheMiddle = Math.max(grid[i][j], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i][j+1], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i][j+2], highestNumberCloseToTheMiddle);

                // check mid row
                highestNumberCloseToTheMiddle = Math.max(grid[i+1][j], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i+1][j+1], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i+1][j+2], highestNumberCloseToTheMiddle);

                // check bottom row
                highestNumberCloseToTheMiddle = Math.max(grid[i+2][j], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i+2][j+1], highestNumberCloseToTheMiddle);
                highestNumberCloseToTheMiddle = Math.max(grid[i+2][j+2], highestNumberCloseToTheMiddle);

                // add highest num to the list
                highestNumbersInMatrix[i][j] = highestNumberCloseToTheMiddle;
                k++;


            }
        }

        return highestNumbersInMatrix;
    }

    private void findHighestNumberInSurroundingElements(int middleElement)
    {

    }

}
