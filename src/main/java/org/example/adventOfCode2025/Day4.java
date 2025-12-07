package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Day4
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day4.txt");
        Day4 d = new Day4();
        int result = d.getAccessiblePaperRolls(content);
        // method to return all adjacent rolls, 2d arr
        System.out.println("result : " + result);

    }

    private int getAccessiblePaperRolls(List<String> content)
    {
        // save  previous row
        // save  current row
        // save next row
        // keep track of touching @ symbols
        /**
         * check if the current element in current row is touching any @ symbol in the prev row
         * it touches prev  @ symbols if there is a @ in prev[current i - 1], prev[ current i ] or prev [current i +1]
         * check if next row hqs touching @ symbols
         * if touchingSymbols are less than 4 then its a good roll so inkrement some counter

         */
        int adjacentSymbols = 0;
        for(int i = 0; i < content.size(); i++)
        {
            if(i > 0)
            {
                char[] previousRow = content.get(i - 1).toCharArray();
            }
            char[] currentRow = content.get(i).toCharArray();
            char[] nextRow = content.get(i + 1).toCharArray();
            // check if the current prev and next are @ symbols
            for(int j = 0; j < currentRow.length - 1; j++)
            {
                char currentElement = currentRow[j];

                //if the current element is not a roll theres no point in checking anything.. in life
                if(currentElement == '@')
                {

                    adjacentSymbols = 0;
                    char previousElement = ' ';
                    if(j > 0)
                    {
                        previousElement = currentRow[j - 1];
                    }

                    char nextElement = currentRow[j + 1];
                    // check prev row here
                    // check current element adjacent rows
                    adjacentSymbols += currentRowNumberOfAdjacentSymbols(j, previousElement, nextElement);
                    // check next row here

                    if(adjacentSymbols < 4)
                    {
                        // it is a good rollie roll so count it
                    }
                }
            }

        }

        return -1;
    }

    private int currentRowNumberOfAdjacentSymbols(int j, char previousElement, char nextElement)
    {
        int adjacentSymbols = 0;
        if(j > 0 && previousElement == '@')
        {
            adjacentSymbols++;
        }

        if(nextElement == '@')
        {
            adjacentSymbols++;
        }
        return adjacentSymbols;
    }

}
