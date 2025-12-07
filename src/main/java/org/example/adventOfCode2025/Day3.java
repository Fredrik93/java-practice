package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day3
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day3.txt");

        Day3 d = new Day3();
        int[] sumOfInvalidIds = d.findTwoLargestNumbers(content);
        int sumNumbers = d.sumNumbers(sumOfInvalidIds);
        System.out.println("result : " + sumNumbers);

    }

    private int[] findTwoLargestNumbers(List<String> content)
    {
        int[] result = new int[content.size()];
        int resIndex =0;

        for(String item : content)
        {
            // in order, find the highest combination of two digits
            // 6791829
            // loop over item
            // keep current digit
            // loop over all digits coming after that
            // keep track of highest number
            int highest = 0;
            for(int i = 0; i < item.length(); i++)
            {
                int highestCombination = 0;
                String firstDigit = String.valueOf(item.charAt(i));
                if(i == item.length()-1){highestCombination = Integer.parseInt(firstDigit); break;}
                int secondHighest = 0;
                for(int j = i + 1; j < item.length(); j++)
                {
                    int secondInt = Character.getNumericValue(item.charAt(j));
                    if(secondInt > secondHighest)
                    {
                        secondHighest = secondInt;
                    }
                }
                String res = firstDigit + secondHighest;
                int current = Integer.parseInt(res);
                if(current > highest)
                {
                    highest = current;
                }
            }
            result[resIndex] = highest;
            resIndex++;}

        return result;
    }

    private int sumNumbers(int[] list)
    {
        int sum = 0;
        for(int num : list)
        {
            sum += num;
        }
        return sum;
    }
}
