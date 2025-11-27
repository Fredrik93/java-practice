package org.example.leetcode.medium;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" "). Signedness: Determine the sign by checking if the next character is
 * '-' or '+', assuming positivity if neither present. Conversion: Read the integer by skipping leading zeros until a
 * non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain
 * in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1
 * should be rounded to 231 - 1. Return the integer as the final result.
 */

public class MyAtoi
{
    public int myAtoi(String s)
    {
        //keep only numericals, stop saving numbers when reaching a letter e.g., keep 12 in 12af32
       // iterate over the string and when you hit a letter keep that substring
        // todo

        // bad code here 1
        int intLimit = 2147483647;
        // convert to sb
        StringBuilder sb = new StringBuilder(s);
        boolean isNegative = false;
        // remove leqding zeros
        while(sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0);
        }
        // if - set boolean isNegqtive, remove the sign and continue
        if(sb.charAt(0) == '-')
        {
            isNegative = true;
            sb.deleteCharAt(0);
        }

        // convert to int
        Integer num = Integer.parseInt(sb.toString());
        // for the conversion check if int is within range, if it is not then:
        int negIntLimit = intLimit * -1;
        if(num < negIntLimit && isNegative)
        {
            num = negIntLimit;
        }
        else if(num > intLimit && !isNegative)
        {
            num = intLimit;
        }

        return isNegative ? num * -1 : num;
    }

}
