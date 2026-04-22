package org.example.leetcode.easy;

import java.util.Arrays;

public class WideVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));

        for(int [] row : points){
            System.out.println(Arrays.toString(row));
        }
return -1;
    }
}
