package org.example.adventOfCode2025;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadInput
{
    /**
     * Utility class
     * Reads the puzzzle input in the aoc file
     * */
    public static List<String> readData(String path) throws IOException
    {
        return Files.readAllLines(Paths.get(path));

    }
}
