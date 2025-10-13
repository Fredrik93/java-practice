package org.example.leetcode.medium;

import java.util.Arrays;

public class PivotArray
{
    public int[] pivotArray(int[] nums, int pivot) {

        // figure out where the pivots place should be in the list
        int [] copy = nums;
        Arrays.sort(copy);
        int indexForPivotElement= 0;

        for(int i = 0; i < copy.length ; i++)
        {
            if(nums[i] == pivot){
                // place in list for pivot el found!
                indexForPivotElement = i;

            }
        }

        // loop over nums
        // if n i is equal, add to list,
        // if n i is larger,  add n i (only once)
        int [] result = new int[nums.length];
        for( int i = 0; i < nums.length; i++){
            // set the pivot
            if(i == indexForPivotElement){
                result[i] = pivot;
            } else {
            int currentNum = nums[i];
            // if n[i] is smaller than pivot, add to new list
            if(currentNum < pivot){
                result[i] = currentNum;
            }
            else if ( currentNum > pivot){

            }
        }
        }
        return result;
    }
}
