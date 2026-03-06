package org.example.leetcode.easy;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * <p>
 * Return the answer in an array.
 */
public class SmallerNumberThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] numberOfOccurencesPerNumber = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int occurenceCounter = 0;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] > nums[j]){
                    occurenceCounter++;
                }

            }
            numberOfOccurencesPerNumber[i] = occurenceCounter;
        }
        return numberOfOccurencesPerNumber;
    }
}
