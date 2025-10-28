package org.example.leetcode.medium;

public class LongestPalindromicSubstring
{
    public String longestPalindrome(String s)
    {
        String result = "";
        for(int i = 0; i < s.length() ; i++)
        {
            if(s.length() % 2 == 0){
            result = expandAroundCenter(i,i+1, s);}
            else{
            result += expandAroundCenter(i, i+1, s);}
        }
        return result;
    }

    private String expandAroundCenter(int left, int right, String s)
    {
        char arr[] = s.toCharArray();
        while(left >= 0 && right < arr.length && arr[left] == arr[right])
        {
            left--;
            right++;
        }
        return s.substring(left, right);
    }
}

