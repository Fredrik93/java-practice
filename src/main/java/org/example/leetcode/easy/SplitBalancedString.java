package org.example.leetcode.easy;

public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        int balanceSum = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char balance = s.charAt(i);
            if (balance == 'L') {
                balanceSum--;
                if (balanceSum == 0) {
                    result++;
                }

            } else if (balance == 'R') {
                balanceSum++;
                if (balanceSum == 0) {
                    result++;
                }

            }


        }
        return result;
    }
}
