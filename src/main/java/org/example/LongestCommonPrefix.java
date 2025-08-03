package org.example;

public class LongestCommonPrefix
{
    public String longestCommonPrefix(String wordsArray[]){

        // if theres only one word then the prefix is that word
        if(wordsArray.length == 1){ return wordsArray[0];}

        // keep a char [] result with longest prefix
        StringBuilder longestPrefix = new StringBuilder();
        // iterate over each string in array
        for(int i = 0; i < wordsArray.length-1; i++)
        {
      // split up string and iterate over that
            char currentWord [] = wordsArray[i].toCharArray();
            char nextWord [] = wordsArray[i+1].toCharArray();
            // keep a char [] result with longest prefix

            int sizeOfMatchingChars = 0;
            // find the shortest word to iterate over
            int sizeOfList = Math.min(currentWord.length, nextWord.length);
            char [] tempLongestCurrentPrefix = new char [10];

            StringBuilder longestCurrentPrefix = new StringBuilder();
            for(int j = 0; j<sizeOfList; j++){
            // compare the current word to the next word, iterate over both and save all matching chars to the prefix var
            if(currentWord[j] == nextWord[j]){
                tempLongestCurrentPrefix[j] = currentWord[j];
                sizeOfMatchingChars++;
            }

            // the prefix variable is not the current. compare that to the next. iterate over next and compare alla characters until the end. overwrite var prefix with that value
            // return the prefix
            //
                }
            for(int k = 0 ; k<sizeOfMatchingChars; k++){
                if(tempLongestCurrentPrefix[k] != ' '){
                    longestCurrentPrefix.append(tempLongestCurrentPrefix[k]);
                }
            }

            int t = longestCurrentPrefix.length();

            if(longestPrefix.isEmpty() || longestCurrentPrefix.length() < longestPrefix.length()){
                longestPrefix.setLength(0);
                // add new
                longestPrefix.append(longestCurrentPrefix)
                ;}
        }

        return longestPrefix.toString();
    }
}
