package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsAndCandies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int mostCandies = 0;
        List<Boolean> result = new ArrayList<>();

        for(int j : candies)
        {
            if(j > mostCandies)
            {
                mostCandies = j;
            }
        }
        for(int candy : candies)
        {
            if(candy + extraCandies >= mostCandies)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
