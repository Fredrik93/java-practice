package org.example.leetcode.easy;

public class MirrorDistance {
    public int mirrorDistance(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        int rev = Integer.parseInt(sb.toString());
        return Math.abs(n-rev);
    }
}
