package org.example.visa;

public class SumNumbersAttempt3

{
    public int sumOfNumbers(int n)
    {
        int result = 0;
        //split upp n
        // make charArr
        char[] arr = String.valueOf(n).toCharArray();
        //loop
        for(int i = 0; i < arr.length; i++)
        {
            int number = Integer.parseInt(String.valueOf(arr[i]));

            if(i % 2 == 0)
            {
                result += number;
            }
            else
            {
                result -= number;
            }
        }
        // for each i % 2 == 0 add to result int , else subtract
        // return result

        return result;
    }
}
