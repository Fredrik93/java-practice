package org.example.leetcode.easy;

public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        // smallest is RL so if you find that it is good

        // split string into char arr
        // loop
        // if next is the same as curr R == R then just continue
        // if curr == R and next == L then you have a subpar, count that
        char [] arr = s.toCharArray();
        int amountOfBalancedSubStrings = 0;
        for (int i = 0; i < arr.length-1; i++) {
            char curr = arr[i];
            char next = arr[+1];
            // check for smallest substring LR RL
            if(curr == 'R' && next == 'L'){ amountOfBalancedSubStrings++;} else if(curr == 'L' && next == 'R'){amountOfBalancedSubStrings++;}
            // probably need to use substrings

        }
    return amountOfBalancedSubStrings;
    }
}
