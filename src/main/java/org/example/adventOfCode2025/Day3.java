package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.List;

public class Day3
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day3.txt");

        Day3 d = new Day3();
        long sumOfInvalidIds = d.amethod(content);

        System.out.println("result : " + sumOfInvalidIds);

    }

    private long amethod(List<String> some)
    {
        return -1;
    }
}
