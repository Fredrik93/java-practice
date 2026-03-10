package org.example.leetcode.medium;

public class MinimumPartition {
    public int minPartitions(String n) {
        int num = Integer.parseInt(n);
        int operations = 0;
        int multiplier = 1;

        while (num > 0) {

            if (num % 10 != 0) {
                num -= 11 * multiplier;
                operations++;
            } else {
                num -= 10 * multiplier;
                operations++;
            }
        }
        return operations;
    }
}
