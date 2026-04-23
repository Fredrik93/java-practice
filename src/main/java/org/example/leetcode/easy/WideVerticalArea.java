package org.example.leetcode.easy;

import java.util.Arrays;

public class WideVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int biggestDifference = 0;
        for(int i = 0; i < points.length-1; i++){
            int current = points[i][0];
            int next = points[i+1][0];
            System.out.println("Compareing ****");
            System.out.println(current);
            System.out.println(next);
            System.out.println("******");
            int diff = next - current;
            biggestDifference = Math.max(diff, biggestDifference);
        }
return biggestDifference;
    }
}
