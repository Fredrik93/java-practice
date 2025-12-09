package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int[] allowedIds = getAllowedIds(content);
        //get ingredients thqt we want to check
        int [] ingredientsToCheck = getIngredientsToCheck(content);
        // save each allowed id into a map
        Map mapOfAllowedIds = saveAllowedIds(allowedIds);

        // for each ingredientid, check if it exists in map

        // if it exists, inkrement counter
        //return counter


        return -1;
    }
    private int [] getAllowedIds(List<String> content){
        return new int[]{};
    }
    private int [] getIngredientsToCheck(List<String> content){
        return new int[]{};
    }

    private Map saveAllowedIds(int [] array){
        return new HashMap<Integer, Integer>(){};
    }

}
