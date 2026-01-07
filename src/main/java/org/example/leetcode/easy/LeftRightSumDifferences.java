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
            int current = i;
            for(int j = 0; j < arr.length; j++)
            {
                // everything to the left of current
                if(j < current){
                sum += arr[j];
            }

            }
            leftArr[i] = sum;
            sum = 0;
        }
        // reset sum for the next loop
        sum = 0;
        //new loop, start from arr.length-1
        int [] rightArr = new int[arr.length];
        for(int i = arr.length-1; i >= 0 ; i--)
        {
            int current = i;
            // loop and for each, add new sum to an array rightArr

            for(int j = 0; j < arr.length; j++)
            {
                // everything to the right of current
                if(j > current){
                    sum += arr[j];
                }

            }
            rightArr[i] = sum;
            sum = 0;
        }
        // now sum the values in i in both arrays and use only the absolute values

        return leftArr;
    }
}
