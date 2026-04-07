package org.example.leetcode.easy;

public class MinNumberMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {

        int sumOfSteps = 0;
        // for each student, go over the seats and find the smallest diff

        for (int i = 0; i < students.length; i++) {
            int shortestPathToASeat = Integer.MAX_VALUE;
            for (int j = 0; j < seats.length; j++) {
                int student = students[i];

                if(seats[j] != -1){
                int seat = seats[j];

                int currentStepsNeededToSeatStudent = Math.abs(student - seat);
                if(currentStepsNeededToSeatStudent < shortestPathToASeat){
                    shortestPathToASeat = currentStepsNeededToSeatStudent;
                    // block the seat for other students
                    seats[j] = -1;
                }
            }

            }

            sumOfSteps += shortestPathToASeat;
        }
        // remove that seat or block it after a student is seated
        // sum up the smallest diffs and return


        return sumOfSteps;
    }
}
