package org.example.leetcode.easy;

public class SmallestMultiple
{
    public int smallestEvenMultiple(int n)
    {
        int number = 1;
        while(true)
        {
            int numTwo = number * n;
            if(numTwo % 2 == 0)
            {
                return numTwo;
            }
            number++;
        }
    }
}
