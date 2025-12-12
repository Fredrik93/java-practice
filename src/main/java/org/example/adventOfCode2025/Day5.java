package org.example.adventOfCode2025;

import java.io.IOException;
import java.net.Inet4Address;
import java.util.*;

public class Day5
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day5.txt");
        Day5 d = new Day5();
        int result = d.getFreshIngredients(content);
        // method to return all adjacent rolls, 2d arr
        System.out.println("result : " + result);

    }

    private int getFreshIngredients(List<String> content)
    {
        // get all allowed ids
        Set<Integer> allowedIds = getAllowedIds(content);
        //get ingredients thqt we want to check
        int[] ingredientsToCheck = getIngredientsToCheck(content);
        // save each allowed id into a map
        Map mapOfAllowedIds = saveAllowedIds(allowedIds);

        // for each ingredientid, check if it exists in map

        // if it exists, inkrement counter
        //return counter var

        return -1;
    }

    private Set<Integer> getAllowedIds(List<String> content)
    {
        Set<Integer> allowedIds = new HashSet<>();
        for(String s : content)
        {
            if(s.isEmpty())
            {
                return allowedIds;
            }
            int firstNumber = Integer.parseInt(s.split("-")[0]);
            int secondNumber = Integer.parseInt(s.split("-")[1]);
            for(int j = firstNumber; j < secondNumber + 1; j++)
            {
                allowedIds.add(j);
            }

        }
        return allowedIds;
    }

    private int[] getIngredientsToCheck(List<String> content)
    {
        int startOfList = 0;
        int[] ingredients;
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
        ingredients = new int[content.size() - startOfList];
        int j = 0;
        for(int i = startOfList; i < content.size(); i++)
        {

            ingredients[j] = Integer.parseInt(content.get(i));
            j++;
        }

        return ingredients;
    }

    private Map saveAllowedIds(Set<Integer> setOfIds)
    {
        return new HashMap<Integer, Integer>()
        {
        };
    }

}
