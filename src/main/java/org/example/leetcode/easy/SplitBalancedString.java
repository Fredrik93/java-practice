package org.example.leetcode.easy;

public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        // smallest is RL so if you find that it is good

        // split string into char arr
        // loop
        // if next is the same as curr R == R then just continue
        // if curr == R and next == L then you have a subpar, count that
        int balanceSum = 0;
        int balanceR = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char balance = s.charAt(i);
            if (balance == 'L') {
                balanceSum++;
            } else if (balance == 'R') {
                if (balanceSum > 0) {
                    balanceSum--;
                }
                if (balanceSum == 0) {
                    result++;
                }
            }

        }
        return result;
    }
}
