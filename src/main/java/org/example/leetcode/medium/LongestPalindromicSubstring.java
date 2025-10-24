package org.example.leetcode.medium;

public class LongestPalindromicSubstring
{
    public String longestPalindrome(String s)
    {
        // convert to chararr
        char[] arr = s.toCharArray();
        //loop over i
        String longestSubString = "";

        for(int i = 0; i < arr.length; i++)
        {
            String tmpSubString = "";
            StringBuilder sb = new StringBuilder();
            String reversed = "";
            for(int j = i ; j < arr.length; j++)
            {
                char el = arr[j];
                sb.append(el);
                tmpSubString = sb.toString();
                reversed = sb.reverse().toString();
                if(tmpSubString.equals(reversed)){
                    if(tmpSubString.length() > longestSubString.length())
                    {
                        longestSubString = tmpSubString;
                    }
                }





            }
        }
        return longestSubString;
    }
}
