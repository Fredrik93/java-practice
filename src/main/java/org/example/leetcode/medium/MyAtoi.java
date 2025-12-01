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
        s = s.trim();
        String onlyDigitsString = null;
        int intLimit = 2147483647;
        // convert to sb
        StringBuilder sb = new StringBuilder(s);
        boolean isNegative = false;

        // if - set boolean isNegqtive, remove the sign and continue
        if(sb.charAt(0) == '-')
        {
            isNegative = true;
            sb.deleteCharAt(0);
        }


        onlyDigitsString = getDigits(sb.toString());

        // convert to int
        //todo fails here, too big
        int num = Integer.parseInt(onlyDigitsString);
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

    private static String getDigits(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(char ch : sb.toString().toCharArray())
        {

            if(Character.isDigit(ch))
            {
                int startIndex = sb.indexOf(String.valueOf(ch));
                int endIndex = startIndex;
                for(int i = startIndex; i<sb.length(); i++ )
                {
                    char curr = sb.charAt(i);
                    endIndex++;
                    if(!Character.isDigit(curr))
                    {
                        return s.substring( startIndex,endIndex-1);
                    }
                }
                return s.substring(startIndex,endIndex);
            } else {return "0";}
        }
        return sb.toString();
    }

}
