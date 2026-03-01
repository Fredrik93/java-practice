package org.example.leetcode.easy;

public class PermutationOfDifference {
    public int findPermutationDifference(String s, String t) {
        // convert to char arrs
        // int of sums
        int totalDifference = 0;
        // int of tempvalue for absol diff of permut
        int tmp = 0;
        // iterate over s
        int indexOfS = 0;
        int indexOft = 0;
        for (char sChar : s.toCharArray()) {
            for (char tChar : t.toCharArray()) {
                if (sChar == tChar) {
                    tmp = Math.abs(indexOfS - indexOft);
                }
                indexOft++;
            }
            indexOfS++;
            totalDifference += tmp;
            indexOft = 0;
            tmp = 0;
        }
        // for each s[i] check distance to t[i], abs value of this
        //return result
        return totalDifference;
    }
}
