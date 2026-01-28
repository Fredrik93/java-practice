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
        int[] allMddleElementsInMatrix = new int[4];
        int [] highestNumbersInMatrix = new int[grid.length];

        int k = 0;
        // gte a list of middleelements. not sure if i need this but i could verify that im getting the mid elements i need at least
        for(int i = 0; i < grid.length/2; i++)
        {

            for(int j = 0; j < grid.length/2; j++)
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
                highestNumbersInMatrix[k] = highestNumberCloseToTheMiddle;
                k++;


            }
        }

        return grid;
    }

    private void findHighestNumberInSurroundingElements(int middleElement)
    {

    }

}
