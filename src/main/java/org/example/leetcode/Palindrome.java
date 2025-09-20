package org.example.leetcode;

public class Palindrome
{
    /**
     * could be more efficient if i dont convert to string
     */
    public boolean isPalindromeUsingString(int x)
    {
        String o = String.valueOf(x);
        int left = 0;
        int right = o.length() - 1;
        while(left < right)
        {
            if(o.charAt(left) == o.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x)
    {
        // set up left and right index. dont know how to get right index.
        int left = 0;
        int right = 0;

        // the first and last digit of the integer. might not be needed i think id rather need indices
        int leftDigit = calculateFirstDigit(x);
        int rightDigit = x % 10;

        // while first < last check if x[left] == x[right]

        // else false

        return false;
    }

    private static int calculateFirstDigit(int num)
    {
        int rest;
        /**
         * Calculate the first (leftmost)  digit
         * example:
         * while x > 10
         * i1
         * 134 % 10 = 4
         * 134 - 4 = 130
         * 130 / 10 = 13
         * i2
         * 13 % 10 = 3
         * 13 - 3  = 10
         * 10 / 10 = 1
         *
         */
        while(num >= 10)
        {
            rest = num % 10;
            num -= rest;
            num = num / 10;

        }
        return num;
    }
}
