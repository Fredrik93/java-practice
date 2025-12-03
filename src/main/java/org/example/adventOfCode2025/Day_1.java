package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.List;

public class Day_1
{
    /**
     * The dial starts by pointing at 50.
     * The dial is rotated L68 to point at 82; during this rotation, it points at 0 once. #1
     * The dial is rotated L30 to point at 52.
     * The dial is rotated R48 to point at 0. #2
     * The dial is rotated L5 to point at 95.
     * The dial is rotated R60 to point at 55; during this rotation, it points at 0 once. #3
     * The dial is rotated L55 to point at 0. #4
     * The dial is rotated L1 to point at 99.
     * The dial is rotated L99 to point at 0. #5
     * The dial is rotated R14 to point at 14.
     * The dial is rotated L82 to point at 32; during this rotation, it points at 0 once. #6
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException
    {

        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day1.txt");
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
                if(current - ticks < 0){
                    ticks -= current;
                    passCode++;
                    while(ticks > ONE_LAP){
                        ticks -= ONE_LAP;
                        passCode++;
                    }
                    current = ONE_LAP - ticks;
                } else
                {
                    current -= ticks;
                }

            } else if(direction == 'R'){
                if(current + ticks > ONE_LAP){
                    passCode++;
                   int remainder = ONE_LAP - current;
                   ticks -= remainder;
                   while(ticks > ONE_LAP){
                       ticks -= ONE_LAP;
                       passCode++;
                   }
                   current = 0;
                   current += ticks;
                } else{
                current += ticks;}
            }
            if(current == 0 || current == ONE_LAP){
                passCode++;
            }
        }
        return passCode;
    }
}
