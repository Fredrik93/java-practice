package org.example.leetcode.easy;

public class MinOperations
{
    public int minOperations(int[] nums, int k)
    {
        // loop over nums
        // sum nums
        // base case: if nums % k == 0 then it is divisble, return sum of nums
        // else subtract from sum until nums % k == 0
        int sumOfNumbers = 0;
        int numberOfOperations =0;
        for(int num : nums)
        {
            sumOfNumbers += num;
        }
        if(sumOfNumbers % k == 0)
        {
            return numberOfOperations;
        }
        else
        {
            while(sumOfNumbers % k != 0)
            {
                numberOfOperations ++;
                sumOfNumbers--;
            }
        }
        return numberOfOperations;
    }
}
