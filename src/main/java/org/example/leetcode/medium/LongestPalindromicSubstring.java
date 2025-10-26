package org.example.leetcode.medium;

public class LongestPalindromicSubstring
{
    public String longestPalindrome(String s)
    {
        char[] arr = s.toCharArray();
        String longestSubString = "";

        for(int i = 0; i < arr.length; i++)
        {
            StringBuilder sb = new StringBuilder();
            StringBuilder reversed;
            for(int j = i; j < arr.length; j++)
            {
                char el = arr[j];
                sb.append(el);
                reversed = new StringBuilder(sb.toString()).reverse();

                if(sb.toString().contentEquals(reversed))
                {
                    if(sb.toString().length() > longestSubString.length())
                    {
                        longestSubString = sb.toString();
                    }
                }

            }
        }
        return longestSubString;
    }
}

