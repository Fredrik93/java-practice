package org.example.leetcode;

public class ShuffleArray
{
    public int[] shuffle(int[] nums, int n)
    {
        int sizeOfList = n * 2;
        int[] xList = new int[n];
        int[] yList = new int[n];
        int[] result = new int[n * 2];
        int yIndex = 0;
        int xIndex = 0;

        // split list in half
        for(int i = 0; i < n; i++)
        {
            xList[i] = nums[i];
        }
        int startingPoint = nums.length / 2;
        int j = 0;
        for(int i = startingPoint; i < nums.length; i++)
        {
            yList[j] = nums[i];
            j++;
        }

        //Shuffle x and y list into one list 'result'
        for(int i = 0; i < sizeOfList; i++)
        {

            if(i % 2 == 0)
            {
                result[i] = xList[xIndex];
                xIndex++;
            }
            else
            {
                result[i] = yList[yIndex];
                yIndex++;
            }
        }
        return result;
    }
}
