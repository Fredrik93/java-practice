package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day6
{
    /**
     * Paste (replace all info in the txt file) the integers below into the day5.txt file to test a smaller set
     * The small test set:
     123 328  51 64
     45 64  387 23
     6 98  215 314
     *   +   *   +

     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day5.txt");
        Day6 d = new Day6();
        long result = d.calulcateChepalopodHomework(content);
        // method to return all adjacent rolls, 2d arr
        System.out.println("result : " + result);

    }

    private long calulcateChepalopodHomework(List<String> content)
    {
        // construct 2d array
        // loop over arr and get the ith column, process that ie perform the arithmetic operator thats in the same column

      return -1;
       }
}
