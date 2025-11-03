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

        char [][] zigzag = mapTo2DArray(s, numRows);

        print2D(Objects.requireNonNull(zigzag));
        return null;
    }

    private static char [][] mapTo2DArray(String s, int numRows)
    {
        char[] arr = s.toCharArray();
        int rowLength = 7;
        char[][] zigzag = new char[numRows][rowLength];
        int tmpIndex = 0;
        int arrIndex = 0;
        for(int i = 0; i < arr.length; i++)
        {

            if(i % 2 == 0)
            {
                for(int j = 0; j < numRows; j++)
                {
                    if(arrIndex == arr.length){
                        return zigzag;
                    }
                    zigzag[tmpIndex][i] = arr[arrIndex];
                    arrIndex++;
                    tmpIndex++;

                }
            }
            else
            {
                int middle = numRows / 2;
                zigzag[middle][i] = arr[arrIndex];

                arrIndex++;
                tmpIndex = 0;
            }

        }
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
