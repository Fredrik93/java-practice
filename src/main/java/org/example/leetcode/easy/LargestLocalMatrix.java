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
        int k = 0;
        // gte a list of middleelements. not sure if i need this but i could verify that im getting the mid elements i need at least
        for(int i = 0; i < 2; i++)
        {
            int middleElement = 0;
            for(int j = 0; j < 2; j++)
            {
                middleElement = grid[i + 1][j + 1];
                allMddleElementsInMatrix[k] = middleElement;
                k++;
            }
        }

        return grid;
    }

}
