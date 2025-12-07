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
        System.out.println("result : " + sumOfInvalidIds);

    }

    private int[] findTwoLargestNumbers(List<String> content)
    {
        int[] result = new int[content.size()];
        for(String item : content)
        {
            List<Integer> list = new ArrayList<>();
            int j = 0;
            char[] arr = item.toCharArray();
            for(char c : arr)
            {
                list.add(Character.getNumericValue(c));
            }
            StringBuilder sb = new StringBuilder();

            int firstDigit = Collections.max(list);
            list.remove(Integer.valueOf(firstDigit));
            int secondDigit = Collections.max(list);
            sb.append(firstDigit);
            sb.append(secondDigit);
                int sum = Integer.parseInt(sb.toString());

                result[j] = sum;
                sb = new StringBuilder();
                j++;

        }

        return new int[] { -23 };
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
