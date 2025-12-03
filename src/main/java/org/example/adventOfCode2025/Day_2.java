package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.List;

public class Day_2
{

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day2.txt");
        // its just one long line
        String oneLongString = content.getFirst();
        // split by ','
        String [] ranges  = oneLongString.split(",");

        for(String range : ranges){
            int startOfRange = Integer.parseInt(range.split("-")[0]);
            int endOfRange = Integer.parseInt(range.split("-")[1]);
            int iterations = endOfRange - startOfRange;
            int current = startOfRange;
            for(int i = 0; i<iterations+1; i++){
                // check each number for validity rules from the task. including start and end numbers
                // rule: number shouldnt be repeated twice e.g., 55 or 6464 or 11
                String s = String.valueOf(current);
                int splitCurrentFirstHalf = Integer.parseInt(s.substring(0,s.length()/2));
                int splitCurrentLastHalf = Integer.parseInt(s.substring(s.length()/2));

                if (splitCurrentFirstHalf != splitCurrentLastHalf){
                    // save some value i think
                }
                else {
                    System.out.println("invalid number: " + current);
                }
                current++;

            }
        }
        Day_2 d = new Day_2();

        System.out.println("Passcode:" );

    }
}
