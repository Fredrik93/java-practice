package org.example.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnknownNumbersAttempt4
{
    public String[][] findUnknownNumber(String[][] mat)
    {
        // sort out if ? is first or last
        if(mat[0][0].equals("?")){
            String missing = mat[0][1];
            int missingNum = Integer.parseInt(missing);
            missingNum = missingNum -1;
            mat[0][0] = String.valueOf(missingNum);
            return mat;
        }




        // loop over matrix
        int missingI = 0;
        int missingJ = 0;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                // when ?, save index to keep track of where it was.
                if(mat[i][j].equals("?"))
                {

                    missingI = i;
                    missingJ = j;
                }
                else
                {
                    // add all els to List ints
                    numbers.add(Integer.parseInt(mat[i][j]));
                }
            }
        }

        int missingNum = -10;
        Collections.sort(numbers);
        System.out.println(numbers);

        for(int i = 0; i <numbers.size()-1; i++){
            if(numbers.get(i) +1 != numbers.get(i+1)){

                missingNum = numbers.get(i)+1;

            }
        }
        numbers.add(missingNum);
        Collections.sort(numbers);
        System.out.println(numbers +" res ");
        // return
        String [][] res = new String[mat.length][mat.length];
       int k= 0;
        for(int i =0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                res[i][j] = String.valueOf(numbers.get(k));
                k++;

            }
        }
        return res;
    }
}
