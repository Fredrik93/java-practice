package org.example.leetcode.medium;

import java.util.Arrays;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
 * display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N A P L S I I G Y   I   R And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 */
public class ZigzagConversion
{
    public String convert(String s, int numRows)
    {
        char[] arr = s.toCharArray();
        int rowLength = 7;
        char[][] zigzag = new char[numRows][rowLength];

        for(int i = 0; i < numRows; i++)
        {
            int tmpIndex = 0;
            for(int j = 0; j < numRows; j++)
            {

                if(i == 0 || i % 2 == 0)
                {
                    // i is 0 or uneven so we add from arr vertically
                    zigzag[tmpIndex][i] = arr[tmpIndex];
                    tmpIndex++;
                }
            }
        }
        print2D(zigzag);
        return null;
    }

    static void print2D(char[][] arr)
    {
        for(char[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
