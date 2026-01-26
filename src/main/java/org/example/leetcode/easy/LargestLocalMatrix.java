package org.example.leetcode.easy;

import org.example.helpers.MatrixHelpers;

public class LargestLocalMatrix
{
    public int[][] largestLocal(int[][] grid)
    {

        String s = null;

        MatrixHelpers.printMatrixInAPrettyWay(grid);
        try
        {
            int arit = 2 / 0;
        }
        catch(ArithmeticException a)
        {
            System.out.println("arith");
        }

        try
        {
            int l = s.length();
        }
        catch(NullPointerException e)
        {
            throw new ArrayIndexOutOfBoundsException(String.valueOf(e));
        }
        System.out.println("here");
        return grid;
    }

}
