package org.example.leetcode.medium;

import java.util.Arrays;
import java.util.Objects;

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

        char[][] zigzag = mapTo2DArray(s, numRows);
        String result = buildString(zigzag, s.length());
        print2D(zigzag);
        return result;
    }

    private static char[][] mapTo2DArray(String s, int numRows)
    {

        int rowLength = 7;
        char[][] zigzag = new char[numRows][rowLength];
        StringBuilder word = new StringBuilder(s);
        int k = numRows - 2;
        int j = 0;
        int column = 0;
        while(!word.isEmpty())

        {

            for(int i = 0; i < numRows; i++)
            {
                zigzag[i][column] = word.charAt(0);
                word.deleteCharAt(0);

            }
            j++;
            column++;

            zigzag[k][column] = word.charAt(0);
            word.deleteCharAt(0);
            k--;
            column++;
            if(numRows == 3)
            {
                column--;
            }

        }

        return zigzag;
        // rest only add one element
        // repeat until no more elements

    }

    private String buildString(char[][] arr, int arrSize)
    {
        StringBuilder sb = new StringBuilder();
        // the sizes are hardcoded, fix that
        for(int i = 0; i < 3; i++)
        {

            for(int j = 0; j < 7; j++)
            {

                char element = arr[i][j];
                if(Character.isLetterOrDigit(element))
                {
                    sb.append(element);
                }
            }
        }
        return sb.toString();
    }

    static void print2D(char[][] arr)
    {
        for(char[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
