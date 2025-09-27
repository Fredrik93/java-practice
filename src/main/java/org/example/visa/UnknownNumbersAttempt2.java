package org.example.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnknownNumbersAttempt2
{
    public String[][] findUnknownNumber(String[][] mat)
    {
        List<Integer> listOfNumbers = new ArrayList<>();
        String[][] output = new String[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                String current = mat[i][j];
                if(!current.equals("?"))
                {
                    listOfNumbers.add(Integer.parseInt(current));
                }
            }
        }
        Collections.sort(listOfNumbers);
        int length = mat.length * mat.length;
        for(int i = 0; i < length - 1; i++)
        {
            if(listOfNumbers.get(i) + 1 != listOfNumbers.get(i + 1))
            {
                listOfNumbers.add(listOfNumbers.get(i) + 1);
                break;
            }
        }
        Collections.sort(listOfNumbers);
        int k = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                output[i][j] = String.valueOf(listOfNumbers.get(k));
                k++;
            }
        }
        return output;
    }
}
