package org.example.visa;

public class SumNumbers
{
    /**
     * Level 1: Sum all numbers of an int e.g., int n = 54321 would be 5 - 4 + 3 - 2 + 1 = 3
     */
    public int sumOfNumbers(int number)
    {
        String s = String.valueOf(number);
        char[] arr = s.toCharArray();
        int result = 0;
        int i = 0;
        for(char c : arr)
        {
            int tmp = Character.getNumericValue(c);
            result += i % 2 == 0 ? +tmp : -tmp;
            i++;
        }
        return result;
    }
}
