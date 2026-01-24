package org.example.leetcode.easy;

public class BitFlip
{
    public int minBitFlips(int start, int goal)
    {
        //convert to binary representation of the start int
        // same for the goal
        // compare each i in start and goal, if they are not the same then count the difference. return the difference, which will be the steps required to get the goal
        String startBinary = Integer.toBinaryString(start);
        String goalBinary = Integer.toBinaryString(goal);
        int countFlips = 0;
        for(int i = 0; i < goalBinary.length(); i++)
        {
            char startTmp =  startBinary.charAt(i);
            char goalTmp = goalBinary.charAt(i);
            if(startTmp != goalTmp){
                // needs flippin
                countFlips++;
            }
        }
        return countFlips;
    }
    }
