package org.example.leetcode.easy;

public class AlternatingSum
{
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(i % 2 == 0){
                sum += curr;
            } else {
                sum -= curr;
            }
        }
        return sum;
    }
}
