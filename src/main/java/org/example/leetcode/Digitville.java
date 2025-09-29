package org.example.leetcode;

public class Digitville
{
    public int[] getSneakyNumbers(int[] nums)
    {
        // loop over nums
        int currentNumber = 0;
        int[] result = new int[2];
        int resultIndex = 0;
        // keep track of current number
        for(int i = 0; i < nums.length; i++)
        {
            currentNumber = nums[i];
            for(int j = 0; j < nums.length; j++)
            {
                // nest nums check all nums that are i != j
                if(i != j && currentNumber == nums[j])
                {
                    // nums[i] == nums [j] save to res
                    result[resultIndex] = currentNumber;
                }
            }
        }
        // return
        return result;
    }

}
