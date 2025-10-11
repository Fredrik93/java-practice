package org.example.leetcode.easy;

public class NumOfLettersInString
{
    public int numJewelsInStones(String jewels, String stones)
    {
        int result = 0;
        char [] stoneArr = stones.toCharArray();
        for(char c: stoneArr){
            if(jewels.contains(String.valueOf(c))){
                result ++;
            }
        }
   return result;
    }
    }
