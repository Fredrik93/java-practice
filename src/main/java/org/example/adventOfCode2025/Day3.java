package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day3
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day3.txt");

        Day3 d = new Day3();
        int[] sumOfInvalidIds = d.findTwoLargestNumbers(content);
        int sumNumbers = Arrays.stream(sumOfInvalidIds).sum();
        System.out.println("result : " + sumNumbers);

    }

    private int[] findTwoLargestNumbers(List<String> content)
    {
        int[] result = new int[content.size()];
        int resIndex = 0;

        for(String item : content)
        {
            int highestNum = 0;
            for(int i = 0; i < item.length(); i++)
            {
                if(i == item.length() - 1)
                {
                    break;
                }
                highestNum = getHighest(item, i, highestNum);
            }
            result[resIndex] = highestNum;
            resIndex++;
        }

        return result;
    }

    private static int getHighest(String item, int i, int highest)
    {
        String firstDigit = String.valueOf(item.charAt(i));
        int secondDigit = getSecondHighest(item, i);
        String res = firstDigit + secondDigit;
        int current = Integer.parseInt(res);
        highest = Integer.max(current, highest);
        return highest;
    }

    private static int getSecondHighest(String item, int i)
    {
        int secondHighest = 0;

        for(int j = i + 1; j < item.length(); j++)
        {
            int secondInt = Character.getNumericValue(item.charAt(j));
            if(secondInt > secondHighest)
            {
                secondHighest = secondInt;
            }
        }
        return secondHighest;
    }
}
