package org.example.visa;

public class UnknownNumber
{
    /**
     * Level 3:
     * A matrix has a bunch of numbers 1,2,3,4,5,6,7,8,9,10,?,12,13,14,15,16 in a 4*4 matrix. They are not ordered. Figure out which number is missing.
     * example input:
     * [
     * [ 1, 3, 5, 4],
     * [ 2, 5, 7, 6],
     * [14, ?,10,15],
     * [ 8, 9,12,16]
     * ]
     * the resulting matrix should be
     * [
     * [1,2,3,4],
     * [5,6,7,8],
     * [9,10,11,12],
     * [13,14,15,16]
     * ]
     * @param matrix
     * @return
     */
    public String [][] findUnknownNumber(String [][] matrix){
        // loop over ij, save eleents to aList.
        // if ij != ?
        // sort list
        // loop over list, if [i]+1 == [i+1] (e.g., i == 13 +1 = 14 is 1 less than its next number 15 then go on, else that number is missing so replace the '?'
        // loop over list, saving ordered items to new mat[][]

        return new String[][]{};
    }
}
