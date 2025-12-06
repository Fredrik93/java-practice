package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day3
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day3.txt");

        Day3 d = new Day3();
        int [] sumOfInvalidIds = d.findTwoLargestNumbers(content);
        int sumNumbers = d.sumNumbers(sumOfInvalidIds);
        System.out.println("result : " + sumOfInvalidIds);

    }

    private int [] findTwoLargestNumbers(List<String> content)
    {
        int highestNumber = 0;
        int nextHighest = 0;
        int indexOfHighest=0;
        int indexOfNextHighestNumber =0;

        int i = 0;
        int[] listOfSums = new int[content.size()];
        String[] listofNumbers = new String[content.size()];
        int sum = 0;

        for(String row : content)
        {
            highestNumber = 0;
            nextHighest = 0;
            char[] arr = row.toCharArray();
            int j = 0;
            int current = 0;
            for(char c : arr)
            {
                current = Character.getNumericValue(c);
                // -1 is the starting unique value
                if(current > highestNumber)
                {
                    highestNumber = current;
                    indexOfHighest = j;
                }
                j++;
            }
            for(int k = 0; k < row.length(); k++)
            {
                current = Character.getNumericValue(arr[k]);
                if(k != indexOfHighest)
                {
                    if(current > nextHighest)
                    {
                        nextHighest = current;
                        indexOfNextHighestNumber = k;
                    }
                }
            }
            if(indexOfHighest < indexOfNextHighestNumber){
                String first = String.valueOf(highestNumber);
                String second = String.valueOf(nextHighest);
                listofNumbers[i] = first + second;
                i++;

            } else {
                String first = String.valueOf(nextHighest);
                String second = String.valueOf(highestNumber);
                listofNumbers[i] = first + second;
                i++;
            }
            sum = highestNumber + nextHighest;
            listOfSums[i] = sum;

        }


        return listOfSums;

    }
    private int sumNumbers (int [] list){
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return sum;
    }
}
