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
        int rolls = 0;
        for(int i = 0; i < content.size()-1; i++)
        {
            int adjacentSymbols = 0;

            char[] previousRow = new char[content.size()];
            if(i > 0)
            {
                previousRow = content.get(i - 1).toCharArray();
            }
            char[] currentRow = content.get(i).toCharArray();
            char[] nextRow = content.get(i + 1).toCharArray();
            // check if the current prev and next are @ symbols
            for(int j = 0; j < currentRow.length; j++)
            {
                char currentElement = currentRow[j];

                //if the current element is not a roll theres no point in checking anything.. in life
               if(currentElement == '@')
                {
                    adjacentSymbols = 0;
                    // check prev row here
                    adjacentSymbols += rowNumberOfAdjacentSymbols(previousRow, j, false);
                    // check current element adjacent rows
                    adjacentSymbols += rowNumberOfAdjacentSymbols(currentRow, j,true);
                    // check next row here
                    adjacentSymbols += rowNumberOfAdjacentSymbols(nextRow, j, false);


                    if(adjacentSymbols < 4)
                    {
                        // it is a good rollie roll so count it
                        rolls++;
                    }
                }
            }

        }

        return rolls;
    }


    private int rowNumberOfAdjacentSymbols(char[] row, int currentIndex, boolean isCurrentRow)
    {
        int adjacentSymbols = 0;
        char prevSymbol = 0;
        char currentSymbol = row[currentIndex];
        char nextSymbol = 0;
        if(currentIndex < row.length-1)
        nextSymbol = row[currentIndex + 1];

        if(currentIndex > 0)
        {
            prevSymbol = row[currentIndex - 1];
            if(prevSymbol == '@')
            {
                adjacentSymbols++;
            }
        }
        // we should check previous and next row for the current symbol, but not the current row
        if(!isCurrentRow && currentSymbol == '@'){
           adjacentSymbols++;
        }
        if(nextSymbol == '@')
        {
            adjacentSymbols++;
        }
        return adjacentSymbols;

    }

}
