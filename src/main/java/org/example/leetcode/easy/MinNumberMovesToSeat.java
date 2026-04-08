package org.example.leetcode.easy;

public class MinNumberMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {

        int sumOfSteps = 0;
        // for each student, go over the seats and find the smallest diff

        for (int student : students) {
            int shortestPathToASeat = Integer.MAX_VALUE;
            int indexOfSeat = 0;

            for (int j = 0; j < seats.length; j++) {

                if (seats[j] != -1) {
                    int seat = seats[j];

                    int currentStepsNeededToSeatStudent = Math.abs(student - seat);
                    if (currentStepsNeededToSeatStudent < shortestPathToASeat) {
                        shortestPathToASeat = currentStepsNeededToSeatStudent;
                        indexOfSeat = j;
                    }


                }


            }
            // block the seat for other students
            seats[indexOfSeat] = -1;
            sumOfSteps += shortestPathToASeat;

        }
        // remove that seat or block it after a student is seated
        // sum up the smallest diffs and return


        return sumOfSteps;
    }
}
