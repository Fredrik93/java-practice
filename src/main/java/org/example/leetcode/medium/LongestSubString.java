package org.example.leetcode.medium;

import javax.management.StringValueExp;

public class LongestSubString
{
    public int lengthOfLongestSubstring(String s)
    {
        // convert to chararr
        // loop over chararr
        char[] charArr = s.toCharArray();
        int longestSubString = 0;

        for(int i = 0; i < charArr.length; i++)
        {
            StringBuilder sb = new StringBuilder();
            // loop again j
            for(int j = i; j < charArr.length; j++)
            {
                // starting from eahxh el j, add el j to new strng "tmp" until a duplicqte shows
                // compare

                if(sb.toString().contains(String.valueOf(charArr[j]))){
                    sb.append(charArr[j]);
                }
                //  var longest and compare longest <= tmp = longest = tmp
                // return longest
            }
            if(longestSubString < sb.length()){
                longestSubString = sb.length();
            }
        }
        return longestSubString;
    }
}

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are
 * also correct answers. Example 2:
 *
 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1. Example 3:
 *
 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the length of 3. Notice that the answer must be
 * a substring, "pwke" is a subsequence and not a substring.
 */