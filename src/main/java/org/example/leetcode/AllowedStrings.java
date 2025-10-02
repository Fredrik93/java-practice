package org.example.leetcode;

public class AllowedStrings
{
    public int countConsistentStrings(String allowed, String[] words)
    {
        // split up allowed into chars
        // loop over allowed
        // loop over words
        // split up word in chars because we have to check if each char is allowed
        // if allowedchar == wordchar is true then all good. if false, dont inkrement counter "allowedWords"
        char[] allowedChars = allowed.toCharArray();
        int allowedWords = 0;

        for(String word : words)
        {
            int charCounter = 0;
            for(char allowedChar : allowedChars)
            {
                // if charcounter is equal to the length of the word then all chars are allowed
                char[] wordChars = word.toCharArray();
                for(char wordChar : wordChars)
                {
                    if(allowedChar == wordChar)
                    {
                        charCounter++;
                    }

                }

            }
            if(charCounter == word.length())
            {
                allowedWords++;
            }
        }

        return allowedWords;

    }

}
