package org.example.visa;

public class SumNumbersAttempt2
{
    public int sumOfNumbers(int x){
        // convert to string
        // turn to chararr
        // loop over
        // if %2 == 0 (1,2,4,6,...) add it
        // else subtract it
        // return res
        int result = 0;
        String input = String.valueOf(x);
        char [] arr = input.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                result += Character.getNumericValue(arr[i]);
            } else { result -= Character.getNumericValue(arr[i]);
            }
        }
        return result;
    }
    //
}
