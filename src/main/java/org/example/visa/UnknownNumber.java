package org.example.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        String [][] output = new String[matrix.length][matrix.length];
        // loop over ij, save eleents to aList.
        List <Integer> listOfElements = new ArrayList();
        int indexOfUnkownElement=0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                String currentElement = matrix[i][j];
                // if ij != ?
                if(!currentElement.equals("?")){
                    Integer currentNum = Integer.parseInt(currentElement);
                    listOfElements.add(currentNum);
                }
            }
        }
        // sort list
        Collections.sort(listOfElements);
        int missingNumber = -1;
        // loop over list, if [i]+1 == [i+1] (e.g., i == 13 +1 = 14 is 1 less than its next number 15 then go on, else that number is missing so replace the '?'
        for(int i = 0; i<listOfElements.size()-1; i++){
            int currentElement = listOfElements.get(i);
            int nextEl = listOfElements.get(i+1);
            // with this check im missing the last element, if the last number is '?'
            if(currentElement +1 != nextEl){

                missingNumber = currentElement+1;

            }
        }
        listOfElements.add(missingNumber);
        Collections.sort(listOfElements);

        // loop over list, saving ordered items to new mat[][]
        int k = 0;

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                output[i][j] = String.valueOf(listOfElements.get(k));
                k++;
            }
        }
        return output;
    }
}
