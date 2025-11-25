package org.example.leetcode.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
 * signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 */
public class ReverseInteger
{
    public int reverse(int x)
    {

        StringBuilder input = new StringBuilder(String.valueOf(x));
        int number = 0;
        if(input.charAt(0) == '-')
        {
            input.deleteCharAt(0);
            input.reverse();
            try
            {
                number = Integer.parseInt(input.toString());
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("nfe" + nfe);
            }
            number *= -1;

            return number;

        }
        else
        {
            try
            {
                number = Integer.parseInt(input.reverse().toString());
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("nfe" + nfe);
            }

            return number;
        }
    }
}
