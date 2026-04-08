package org.example.leetcode.easy;


import java.util.Arrays;

public class MinNumberMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {
        //sort arrays
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        // greedily match smallest seat with smallest student and sum
        for (int i = 0; i < students.length; i++) {
            sum += Math.abs(students[i] - seats[i]);
        }
        return sum;
    }
}
