package org.example.adventOfCode2025;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day_1
{
    // Source - https://stackoverflow.com/a/28219618
    // Posted by Nery Jr, modified by community. See post 'Timeline' for change history
    // Retrieved 2025-11-29, License - CC BY-SA 4.0


    private void exerc() throws IOException
    {
        List<String> content = Files.readAllLines(Paths.get("src/main/java/org/example/adventOfCode2025/puzzle_input/Day_1.txt"));
        System.out.println(content);
    }

    public static void main(String[] args) throws IOException
    {
        Day_1 d = new Day_1();
        d.exerc();
    }
}
