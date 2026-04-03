package org.example.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumberMovesToSeat {
    private final int RANDOM_HIGH_NUMBER = 1000000000;
    public int minMovesToSeat(int[] seats, int[] students) {
        List<Integer> seatsList = new ArrayList<>();

        // turn seats into arraylst. remove the seat when its been assigned.
        Arrays.stream(seats).forEach(seatsList::add);

        int stepsForAStudentToASeat = RANDOM_HIGH_NUMBER;
        int result = 0;
        // loop over students
        for (int i = 0; i < students.length; i++) {
            int currentStudent = students[i];

            for (Integer seat : seatsList) {
                int currentAmountOfSteps = 0;
                currentAmountOfSteps = currentStudent > seat ? currentStudent - seat: seat - currentStudent;
                if(currentAmountOfSteps < stepsForAStudentToASeat){
                    stepsForAStudentToASeat = currentAmountOfSteps;
                }
            }
            // todo should remove the seat from the list when it is occupied
            result += stepsForAStudentToASeat;
        }
        // for the ith student, check how far he is from each of the seats, both ways ie a student i=2 could have a seat at both 1 or 5. but 1 is closer so choose that
        // save the number that it takes for the student to get to the seat, sum up all these
        return result;
    }
}
