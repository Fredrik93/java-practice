package org.example.leetcode.easy;

public class LetterFrequency
{
        public int maxFreqSum(String s) {
            int highestFrequencyOfVowels = 0;
            int highestFrequencyOfConsonants = 0;
            String vowels = "aeiou";
            for(char  currentChar : s.toCharArray()){
                int occurencesOfCurrentChar = 0;
              for(char c : s.toCharArray()){
                  if(currentChar == c){
                      occurencesOfCurrentChar++;
                  }

              }
              if(vowels.contains(Character.toString(currentChar))){
                  if(occurencesOfCurrentChar > highestFrequencyOfVowels){
                      highestFrequencyOfVowels = occurencesOfCurrentChar;
                  }
              } else {
                  if(occurencesOfCurrentChar > highestFrequencyOfConsonants){
                      highestFrequencyOfConsonants = occurencesOfCurrentChar;
                  }
              }
        }
        return highestFrequencyOfVowels + highestFrequencyOfConsonants;
    }
}
