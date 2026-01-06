package org.example.leetcode.easy;

public class LeftRightSumDifferences
{
    public int [] sumDifference (int[] arr){
        // start from i = 0
        // loop over arr
        // for each, add the new sum to an array leftArr
        int sum = 0;
        int [] leftArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            leftArr[i] = sum;
        }
        // reset sum for the next loop
        sum = 0;
        //new loop, start from arr.length-1

        // loop and for each, add new sum to an array rightArr

        return new int[] {-1,-1};
    }
}
