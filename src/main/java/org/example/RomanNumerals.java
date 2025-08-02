package org.example;

public class RomanNumerals
{
    public int romanToInt(String s)
    {
        // split up string in chars
        char sArr[] = s.toCharArray();
        // parse the chars and turn into integers
        // add integers tox a list
        int intArr[] = convertToIntArr(sArr);
        int result = sumIntegers(intArr);
        return result;

    }

    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    private int[] convertToIntArr(char[] cArr)
    {
        int intArr[] = new int[cArr.length];
        for(int i = 0; i < cArr.length; i++)
        {

            switch(cArr[i])
            {
                case 'I' -> intArr[i] = 1;
                case 'V' -> intArr[i] = 5;
                case 'X' -> intArr[i] = 10;
                case 'L' -> intArr[i] = 50;
                case 'C' -> intArr[i] = 100;
                case 'D' -> intArr[i] = 500;
                case 'M' -> intArr[i] = 1000;
                default ->
                {
                    return null;
                }
            }
        }
        return intArr;
    }

    private int sumIntegers(int arr[])
    {
        int sum = 0;
        // iterate over the list, if i > j then sum. if i < j then subtract

        for(int i = 0; i < arr.length; i++)
        {
            // reached the end of the array
            int current = arr[i];
            if(i == arr.length-1){sum += current; return sum;}
            int next = arr[i + 1];
            if(current >= next)
            {
                sum += current;
            }
            else if(current < next)
            {
                int subtractedNumber = next - current;
                sum += subtractedNumber;
                i++;
            }
        }
        return sum;
    }
}
