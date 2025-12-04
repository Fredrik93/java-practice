package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.List;

public class Day_2
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day2.txt");
        // its just one long line
        String oneLongString = content.getFirst();
        // split by ','
        String[] ranges = oneLongString.split(",");

        Day_2 d = new Day_2();
        long sumOfInvalidIds = d.getSumOfInvalidIds(ranges);

        System.out.println("Sum : " + sumOfInvalidIds);

    }

    private long getSumOfInvalidIds(String[] ranges)
    {
        long sumOfInvalidIds = 0;

        for(String range : ranges)
        {
            long startOfRange = Long.parseLong(range.split("-")[0]);
            long endOfRange = Long.parseLong(range.split("-")[1]);
            long iterations = endOfRange - startOfRange;
            long current = startOfRange;
            for(int i = 0; i < iterations + 1; i++)
            {
                // check each number for validity rules from the task. including start and end numbers
                // rule: number shouldnt be repeated twice e.g., 55 or 6464 or 11
                String s = String.valueOf(current);

                String splitCurrentFirstHalf = s.substring(0, s.length() / 2);
                String splitCurrentLastHalf = s.substring(s.length() / 2);

                if(splitCurrentFirstHalf.equals(splitCurrentLastHalf))
                {
                    if(s.charAt(0) == '0')
                    {// number shouldnt start with a zero
                        break;
                    }
                    //  System.out.println("invalid number: " + current);
                    sumOfInvalidIds += current;
                    // System.out.println("Current sumOfInvalidIds is :" + sumOfInvalidIds);

                }

                current++;

            }
        }
        return sumOfInvalidIds;
    }
}
