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
        int [] allMddleElementsInMatrix = new int[]{};
        for(int i = 0; i<4; i++){
            int middleElement =0;
            for(int j = 0; j < 4; j++)
            {
                middleElement = grid[i+1][j+1];
                allMddleElementsInMatrix[j] = middleElement;
            }
        }

        return grid;
    }

}
