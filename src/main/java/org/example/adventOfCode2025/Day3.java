package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.List;

public class Day3
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day3.txt");

        Day3 d = new Day3();
        int [] sumOfInvalidIds = d.findTwoLargestNumbers(content);

        System.out.println("result : " + sumOfInvalidIds);

    }

    private int [] findTwoLargestNumbers(List<String> content)
    {
        int highestNumber = 0;
        int nextHighest = 0;
        int i = 0;
        int [] listOfSums = new int[content.size()];
        for(String row : content){
            highestNumber =0;
            nextHighest = 0;
            char [] arr = row.toCharArray();
            int current=0;
            boolean highestIsFound = false;
            for (char c : arr){
                current = Character.getNumericValue(c);
                // -1 is the starting unique value
               if(current > highestNumber && !highestIsFound){
                   highestNumber = current;
                   highestIsFound = true;
               }  else if (current > nextHighest){
                   nextHighest = current;
               }
            }
            int sum = highestNumber + nextHighest;
            listOfSums[i] = sum;
            i++;
        }
        return listOfSums;
    }
}
