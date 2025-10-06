package org.example.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnknownNumbersAttempt3
{
    public String[][] findUnknownNumber(String[][] mat)
    {

    boolean isFirstInList = false;
    boolean isLastInList = false;
        // make list, add all [i][j] elements
        List<Integer> listOfNumbers = new ArrayList<>();
        // loop over i
        // loop over j
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                if(i + j == 0){
                    isFirstInList = true;
                } else if (i + j == mat.length * mat.length){
                    isLastInList = true;
                }
                if(!mat[i][j].equals("?"))
                {

                    listOfNumbers.add(Integer.parseInt(mat[i][j]));
                }

            }
        }
        System.out.println(listOfNumbers + " list");
        // sort list
        Collections.sort(listOfNumbers);
        // iterate over list, if(el.get(i] +1 != el.get(i+1) then the number is missing so add
        // int missingNUm = el.get(i)+1
        int missingNumber = 0;
        for(int i = 0; i < listOfNumbers.size() - 1; i++)
        {
            int current = listOfNumbers.get(i);
            int next = listOfNumbers.get(i + 1);
            System.out.println("curr: " + current + " next: " + next);
            if(current + 1 != next)
            {
                missingNumber = current + 1;
            }
        }
        listOfNumbers.add(missingNumber);
        Collections.sort(listOfNumbers);
        // new matrix, loop over and add all nums again from list
        String[][] result = new String[mat.length][mat.length];
        System.out.println("list: " + listOfNumbers);
        if(isFirstInList){
            int missingNum = listOfNumbers.get(1)-1;
            System.out.println("missing: " + missingNum);
            listOfNumbers.removeFirst();
            listOfNumbers.addFirst( missingNum);
        } else if (isLastInList){
            int num = listOfNumbers.getLast() +1 ;
            listOfNumbers.removeLast();
            listOfNumbers.addLast(num);
        }
        int k = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                result[i][j] = String.valueOf(listOfNumbers.get(k));
                k++;
            }
        }

        // return matrix
        return result;
    }
}
