package org.example.leetcode;

import java.util.Arrays;

public class Digitville
{
    public int[] getSneakyNumbers(int[] nums)
    {
        // loop over nums
        // keep track of current number
        int currentNumber = 0;
        int nextNumber =0;
        int ind= 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            currentNumber = nums[i];

            for(int j = 0; j < nums.length; j++)
            {
                nextNumber = nums[j];
                // nest nums check all nums that are i != j
                if(i != j){
                    if(currentNumber == nextNumber && i < j) {
                        result[ind] = currentNumber;
                        ind++;
                    }
                }
            }
        }
        Arrays.sort(result);
        // return
        return result;
    }

}
