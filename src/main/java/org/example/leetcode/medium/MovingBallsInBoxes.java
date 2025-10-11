package org.example.leetcode.medium;

/**
 * 1769. Minimum Number of Operations to Move All Balls to Each Box Medium Topics premium lock icon Companies Hint You
 * have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1'
 * if it contains one ball.
 *
 * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
 * Note that after doing so, there may be more than one ball in some boxes.
 *
 * Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to
 * the ith box.
 *
 * Each answer[i] is calculated considering the initial state of the boxes.
 *
 *
 */
public class MovingBallsInBoxes
{
    public int[] minOperations(String boxes)
    {
        int totalOperations = 0;
        // convert string to int [] array. '0' is a character trick to get the correct int
        int[] input = boxes.chars().map(c -> c - '0').toArray();
        int [] result = new int[input.length];

        for(int i = 0; i < boxes.length(); i++)
        {
            // keep track of current i
            // iniside, loop again, go over all i != j

            for(int j = 0; j<input.length; j++)
            {
                int current = input[j];
                // if input[j] has a 1, count how many steps in needs to take to go to current i (so, maybe i -j = steps )
                if(current == 1 && i != j){
                    int stepsToOrigin = Math.abs(i-j);
                    totalOperations += stepsToOrigin;
                }
                // count total number ofsteps
            }
            result[i] = totalOperations;
            totalOperations =0;
        }
        return result;
    }

}
