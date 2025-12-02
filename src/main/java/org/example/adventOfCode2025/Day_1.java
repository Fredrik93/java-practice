package org.example.adventOfCode2025;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day_1
{
    /**
     * The dial starts by pointing at 50.
     * The dial is rotated L68 to point at 82.
     * The dial is rotated L30 to point at 52.
     * The dial is rotated R48 to point at 0.
     * The dial is rotated L5 to point at 95.
     * The dial is rotated R60 to point at 55.
     * The dial is rotated L55 to point at 0.
     * The dial is rotated L1 to point at 99.
     * The dial is rotated L99 to point at 0.
     * The dial is rotated R14 to point at 14.
     * The dial is rotated L82 to point at 32.
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException
    {

        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/Day_1.txt");
        Day_1 d = new Day_1();
        int result = d.rotate(content);
        System.out.println("Passcode:" + result);

    }
    private int rotate (List<String> content){
        /**
         * Loop over content, for eqch take apart letter and digit
         * keep limit of 0 - 100
         * if L subtract with digit else if R add
         * if 0 increment counter
         */
        int ONE_LAP = 100;
        int passCode = 0;
        int current = 50;

        for(String instruction : content){
            char direction = instruction.charAt(0);
            int ticks = Integer.parseInt(instruction.substring(1));

            if(direction == 'L'){
                int te = current -ticks;
                if(current - ticks < 0){
                    ticks -= current;
                    while(ticks > 100){
                        ticks -= ONE_LAP;
                    }
                    current = ONE_LAP - ticks;
                } else
                {
                    current -= ticks;
                }

            } else if(direction == 'R'){
                if(current + ticks > 100){
                   int remainder = 100 - current;
                   ticks -= remainder;
                   while(ticks > 100){
                       ticks -= ONE_LAP;
                   }
                   current = 0;
                   current += ticks;
                } else{
                current += ticks;}
            }
            if(current == 0 || current == 100){
                passCode++;
            }
        }
        return passCode;
    }
}
