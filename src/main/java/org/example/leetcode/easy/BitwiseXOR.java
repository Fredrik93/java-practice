package org.example.leetcode.easy;

public class BitwiseXOR {
    public int xorOperation(int n, int start) {
        int sum = 0;
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        for (int num: nums){
            sum ^= num;
        }
        return sum;
    }
}
