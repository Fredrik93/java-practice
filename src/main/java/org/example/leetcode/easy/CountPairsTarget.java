package org.example.leetcode.easy;

import java.util.List;

public class CountPairsTarget
{
    public int countPairs(List<Integer> nums, int target)
    {
        int n = nums.size();
        int countPairs = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            for(int j = 0; j < nums.size(); j++)
            {
                if(0 <= i && i < j && j < n){
                   if(nums.get(i) + nums.get(j) < target){
                       countPairs++;
                   }
                }

            }
        }
        return countPairs;
    }
}
