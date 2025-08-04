package org.example;

public class LongestCommonPrefix
{
    public String longestCommonPrefix(String wordsArray[])
    {

        // if theres only one word then the prefix is that word
        if(wordsArray.length == 1)
        {
            return wordsArray[0];
        }

        // keep a char [] result with longest prefix
        StringBuilder longestPrefix = new StringBuilder();
        // iterate over each string in array
        for(int i = 0; i < wordsArray.length - 1; i++)
        {
            // split up string and iterate over that
            //if words doesnt exist return ""
            if(wordsArray[i].isEmpty() || wordsArray[i + 1].isEmpty())
            {
                return "";
            }
            char currentWord[] = wordsArray[i].toCharArray();
            char nextWord[] = wordsArray[i + 1].toCharArray();
            //if the first letter doesnt match just return "" right away
            if(currentWord[0] != nextWord[0])
            {
                return "";
            }

            // find the shortest word to iterate over
            int sizeOfList = Math.min(currentWord.length, nextWord.length);
            StringBuilder longestCurrentPrefix = new StringBuilder();
            for(int j = 0; j < sizeOfList; j++)
            {

                // compare the current word to the next word, iterate over both and save all matching chars to the prefix var
                if(currentWord[j] == nextWord[j])
                {
                    longestCurrentPrefix.append(currentWord[j]);
                } else { break;}

            }

            if(longestPrefix.isEmpty() || longestCurrentPrefix.length() < longestPrefix.length())
            {
                longestPrefix.setLength(0);
                longestPrefix.append(longestCurrentPrefix);
            }
        }
        return longestPrefix.toString();
    }
}
