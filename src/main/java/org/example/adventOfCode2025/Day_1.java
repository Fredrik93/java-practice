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


    public static void main(String[] args) throws IOException
    {

        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/Day_1.txt");
        Day_1 d = new Day_1();
        int result = d.rotate(content);
        var bool = true;

    }
    private int rotate (List<String> content){
        // start at 50
        /**
         * Loop over content, for eqch take apart letter and digit
         * keep limit of 0 - 100
         * if L subtract with digit else if R add
         * if 0 increment counter
         */
        int passCode = 0;
        int current = 50;

        for(String instruction : content){
            char direction = instruction.charAt(0);
            int ticks = Integer.parseInt(instruction.substring(1));

            if(direction == 'L'){
                // if we reach 0
                if(current - ticks < 0){
                    ticks -= current;
                    current = 99 - ticks;
                } else
                //normal
                {
                    current -= ticks;
                }

            } else if(direction == 'R'){
                // if we reach 99
                if(current + ticks > 99){
                   int remainder = 99 - current;
                   ticks -= remainder;
                   current = 0;
                   current += ticks;
                   // normal
                } else{
                current += ticks;}
            }
            if(current == 0){
                passCode++;
            }
        }
        return passCode;
    }
}
