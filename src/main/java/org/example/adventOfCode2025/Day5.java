package org.example.adventOfCode2025;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Day5
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day5.txt");
        Day5 d = new Day5();
        long result = d.getFreshIngredients(content);
        // method to return all adjacent rolls, 2d arr
        System.out.println("result : " + result);

    }

    private long getFreshIngredients(List<String> content)
    {
        Set<Long> allowedIds = getAllowedIds(content);
        long[] ingredientsToCheck = getIngredientsToCheck(content);
        return countAllowedIDs(allowedIds, ingredientsToCheck);
    }
    private List<Range> getAllowedRanges(List<String> content) {
        List<Range> ranges = new ArrayList<>();
        for (String s : content) {
            if (s.isEmpty()) break;
            String[] parts = s.split("-");
            ranges.add(new Range(
                    Long.parseLong(parts[0]),
                    Long.parseLong(parts[1])
            ));
        }
        return ranges;
    }
    record Range(long start, long end) {}

    private Set<Long> getAllowedIds(List<String> content)
    {
        Set<Long> allowedIds = new HashSet<>();
        for(String s : content)
        {
            if(s.isEmpty())
            {
                return allowedIds;
            }
            long firstNumber = Long.parseLong(s.split("-")[0]);
            long secondNumber = Long.parseLong(s.split("-")[1]);
            for(long j = firstNumber; j < secondNumber + 1; j++)
            {
                allowedIds.add(j);
            }

        }
        return allowedIds;
    }

    private long[] getIngredientsToCheck(List<String> content)
    {
        int startOfList = 0;
        long[] ingredients;
        // Figure out how many strings of the list we want
        for(String c : content)
        {
            if(c.isEmpty())
            {
                // is c is empty then we found the divider between the different data
                // +1 because c is currently the empty string, not a number we want
                startOfList = content.indexOf(c + 1);
            }
        }
        ingredients = new long[content.size() - startOfList];
        int j = 0;
        for(int i = startOfList; i < content.size(); i++)
        {

            ingredients[j] = Integer.parseInt(content.get(i));
            j++;
        }

        return ingredients;
    }

    private int countAllowedIDs(Set<Long> allowedIds, long [] ingredientsToCheck)
    {
        int approvedIngredientIDs = 0;
        for(int i = 0; i < ingredientsToCheck.length; i++)
        {
            long currentIngredientId = ingredientsToCheck[i];
            if(allowedIds.contains(currentIngredientId)){
                approvedIngredientIDs++;
            }
        }
        return approvedIngredientIDs;
    }

}
