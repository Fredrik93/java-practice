package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.*;

public class Day5
{
    /**
     * Paste (replace all info in the txt file) the integers below into the day5.txt file to test a smaller set
     * The small test set:
     * 3-5
     * 10-14
     * 16-20
     * 12-18
     *
     * 1
     * 5
     * 8
     * 11
     * 17
     * 32
     * @param args
     * @throws IOException
     */

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
        List<Range> allowedIds = getAllowedRanges(content);
        long[] ingredientsToCheck = getIngredientsToCheck(content);
        return countAllowedIDs(allowedIds, ingredientsToCheck);
    }

    private List<Range> getAllowedRanges(List<String> content)
    {
        List<Range> ranges = new ArrayList<>();
        for(String s : content)
        {
            if(s.isEmpty())
                break;
            String[] parts = s.split("-");
            ranges.add(new Range(Long.parseLong(parts[0]), Long.parseLong(parts[1])));
        }
        return ranges;
    }

    record Range(long start, long end)
    {}

    private long[] getIngredientsToCheck(List<String> content)
    {
        long[] ingredients;
        int startIndexOfIngredientsToCheck = findStartOfIngredientsToCheck(content) +1;
        ingredients = new long[content.size() - startIndexOfIngredientsToCheck];
        int j = 0;
        for(int i = startIndexOfIngredientsToCheck; i < content.size(); i++)
        {
            try
            {
                long ingredientId = Long.parseLong(content.get(i));
                ingredients[j] = ingredientId;
                j++;
            }
            catch(IndexOutOfBoundsException iob)
            {
                System.out.println("ioby " + iob.getMessage());
            }
            catch(NumberFormatException nf)
            {
                System.out.println("nfy cause: " + nf.getMessage() + " msg: " + nf.getMessage());
            }
        }

        return ingredients;
    }

    private int findStartOfIngredientsToCheck(List<String> content)
    {
        for(String s : content)
        {
            if(s.isEmpty())
            {
                return content.indexOf(s);
            }
        }
        return -1;

    }

    private int countAllowedIDs(List<Range> allowedIds, long[] ingredientsToCheck)
    {
        Set <Long> ingredients = new HashSet<>();
        for(long currentIngredientId : ingredientsToCheck)
        {
            for(Range range : allowedIds)
            {
                if(currentIngredientId >= range.start && currentIngredientId <= range.end)
                {
                    ingredients.add(currentIngredientId);
                }
            }
        }
        return ingredients.size();
    }

}
