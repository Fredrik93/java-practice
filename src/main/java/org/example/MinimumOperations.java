package org.example;

public class MinimumOperations
{
    public int minimumOperations(int[] nums)
    {

        int countOperations = 0;
        for(int num : nums)
        {
            int addedOne = num + 1;
            int removedOne = num - 1;
            countOperations += addedOne % 3 == 0 || removedOne % 3 == 0 ? 1 : 0;

        }
        return countOperations;
    }
}
