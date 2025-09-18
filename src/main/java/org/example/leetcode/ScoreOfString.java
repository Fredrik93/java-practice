package org.example.leetcode;

public class ScoreOfString
{
    public int scoreOfString(String s){
        // split s into chars
        // save ascii for each char
        // loop
        // i - i+1 and save to result
        int result = 0;
        char [] arr = s.toCharArray();
        for(int i = 0; i<arr.length-1; i++){
            int current = arr[i];
            int next = arr[i+1];
            int tempRes = current -next;
            result += Math.abs(tempRes);

        }

        return result;
    }
}
