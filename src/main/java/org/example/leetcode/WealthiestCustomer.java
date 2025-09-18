package org.example.leetcode;

public class WealthiestCustomer
{
    public int maximumWealth(int[][] accounts)
    {
        // loop over first array
        // inside loop over second
        // in second, sum a tempRes with all elements
        // if tempRes is higher than the richestCustomer then set richestCu = tempRes
        int richestCustomer = 0;

        for(int[] account : accounts)
        {
            int tempScore = 0;
            for(int a : account)
            {
                tempScore += a;
            }
            if(tempScore > richestCustomer)
            {
                richestCustomer = tempScore;
            }
        }
        return richestCustomer;
    }

}
