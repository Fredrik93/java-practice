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
        if (numRows <= 1) { return s;}
        char[][] zigzag = mapTo2DArray(s, numRows);
        String result = buildString(zigzag, numRows);
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
                if(!word.isEmpty())
                {
                    zigzag[i][column] = word.charAt(0);
                    word.deleteCharAt(0);
                    j++;
                }
            }

            j++;
            if(numRows > 2){
            column++;
            }
            if(numRows == 4)
            {
                k = numRows - 2;
                for(int i = 0; i < 2; i++)
                {
                    if(!word.isEmpty())
                    {

                        zigzag[k][column] = word.charAt(0);
                        word.deleteCharAt(0);
                    }
                    k--;
                    column++;

                }
            }
            else if(numRows == 5 ){

            }
            else
            {
                if(!word.isEmpty() && numRows > 2)
                {

                    zigzag[k][column] = word.charAt(0);
                    word.deleteCharAt(0);
                }
                if(numRows != 3)
                {
                    k--;
                }
                column++;
            }

        }

        return zigzag;

    }

    private String buildString(char[][] arr, int numRows)
    {
        StringBuilder sb = new StringBuilder();
        int rowLength = arr[0].length;
        for(int i = 0; i < numRows; i++)
        {

            for(int j = 0; j < rowLength; j++)
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
