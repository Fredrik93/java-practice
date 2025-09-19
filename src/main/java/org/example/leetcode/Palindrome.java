package org.example.leetcode;

public class Palindrome
{
    public boolean isPalindrome(int x)
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
}
