package org.example;

import java.util.Arrays;

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

    /**
     * This is pretty neat and works just as well as the method above
     */
    public int minimumOperationsStream(int[] nums)
    {
        return (int) Arrays.stream(nums)
                .filter(num -> (num + 1) % 3 == 0 || (num - 1) % 3 == 0)
                .count();
    }

}
