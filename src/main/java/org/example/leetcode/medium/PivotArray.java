package org.example.leetcode.medium;

import java.util.Arrays;

public class PivotArray
{
    public int[] pivotArray(int[] nums, int pivot) {


        // loop over nums
        int [] result = new int[nums.length];
        // keep track of result list
        int i = 0;
        // populate list with num < piv
        for(int num : nums){
            if(num < pivot){
                result[i] = num;
                i++;
            }
        }
        // pop with num == piv
        for( int num : nums){
            if(num == pivot)
            {
                result[i] = num;
                i++;
            }

        }
        // pop with num > piv
        for( int num : nums){
            if(num > pivot)
            {
                result[i] = num;
                i++;
            }

        }

        return result;
    }
}
