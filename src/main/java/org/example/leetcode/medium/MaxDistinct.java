package org.example.leetcode.medium;
import java.util.HashSet;
import java.util.Set;

/**
You are given a string s consisting of lowercase English letters.
Return an integer denoting the maximum number of substrings
you can split s into such that each substring starts with a
 distinct character (i.e., no two substrings start with the same character).
 */
public class MaxDistinct {
    public int maxDistinct(String distinct){
        //iterate over all chars of distinct

        // if the first char is not the same as the current substrings char then store substring in a hashset
        // count and return hashset
        char [] distChars = distinct.toCharArray();
        Set<Character> setOfChars = new HashSet<>();
        for(Character ch : distChars){
            setOfChars.add(ch);
        }


        return setOfChars.size();
    }
}
