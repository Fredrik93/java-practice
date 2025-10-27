package org.example.leetcode.medium;

public class LongestPalindromicSubstring
{
    public String longestPalindrome(String s)
    {
        char arr[] = s.toCharArray();
        int midInt = arr.length / 2;

        if(arr.length % 2 == 0)
        {
            // if the array is even we need to start with compqring the two middlemost numbers
            // a,b,b,c -> start with check if b == b
            // todo: for now only work with uneven arrs for simplicity

        }
        int ink = 1;
        for(int i = 0; i < midInt; i++)
        {
            //char middle = arr[midInt];
            int prevIndex = midInt-ink;
            char prev = arr[prevIndex];
            int nextIndex = midInt+ink;
            char next = arr[nextIndex];
            ink++;
            if(prev != next){

                // cut out a substring of the selected chars
                return s.substring(prevIndex, nextIndex);
            }
        }
        return s;
    }
}

