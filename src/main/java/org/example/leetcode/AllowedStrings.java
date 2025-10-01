package org.example.leetcode;

public class AllowedStrings
{
    public int countConsistentStrings(String allowed, String[] words)
    {
        // split up allowed
        char [] allowedChars  = allowed.toCharArray();
        int countAllowedWords=0;
        // loop over words
        for(String word : words)
        {

            // split up word

            char [] wordChar = word.toCharArray();
            // loop over allowed
            for(char ac : allowedChars){
                // if allowedChars.size() == wordIsAllowed then the word is allowed
                int charIsAllowed=0;
            // for each allowed, loop over each char in word
                for(char wc : wordChar)
                {
                    // check if c in allowed exist. if not, dont inkrement counter
                    if(ac == wc){
                        charIsAllowed++;
                    }
                    // return counter
                }
                if(allowedChars.length == charIsAllowed){
                    countAllowedWords++;
                }
        }}
        return countAllowedWords;
    }

}
