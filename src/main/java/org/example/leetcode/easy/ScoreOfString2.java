package org.example.leetcode.easy;

public class ScoreOfString2
{
    public int scoreOfString(String s){
        char [] arr = s.toCharArray();
        int sumOfScore =0;
        for(int i = 0; i<arr.length-1; i++){
             sumOfScore += Math.abs(arr[i] - arr[i+1]);
        }
        return sumOfScore;
    }
}
