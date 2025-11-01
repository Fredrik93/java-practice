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
        // i need q 2 dim array
        // numrows define how many vertical dimensions i need
        // try a 2d array with ex1 and start adding chars
        char [] [] zigzag = new char[3][7];
        int k = 0;
        int l = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j < 5 ; j++)
            {
                if(k < arr.length)
                {
                    zigzag[k][l] = arr[k];
                    k++;
                }


            }
            l++;

        }
        print2D(zigzag);
        boolean h = true;
        return null;
    }

    static void print2D(char[][] arr) {
        for (char[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
