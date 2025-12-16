package org.example.adventOfCode2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day6
{
    /**
     * Paste (replace all info in the txt file) the integers below into the day5.txt file to test a smaller set The
     * small test set: 123 328  51 64 45 64  387 23 6 98  215 314 +   *   +

     */

    public static void main(String[] args) throws IOException
    {
        List<String> content = ReadInput.readData("src/main/java/org/example/adventOfCode2025/puzzle_input/day6.txt");
        Day6 d = new Day6();
        long result = d.calulcateChepalopodHomework(content);
        // method to return all adjacent rolls, 2d arr
        System.out.println("result : " + result);

    }

    private long calulcateChepalopodHomework(List<String> content)
    {
        List<Character> sizeOfRows = getArithmeticOperators(content.getLast());
        // construct 2d array
        String[][] arrayOfNumbers = construct2dArray(content, sizeOfRows.size());

        // loop over arr and get the ith column, process that ie perform the arithmetic operator thats in the same column. return result of ith column operation
        int calculcateSumOfOneColumn = calculateSumOfOneColumn(arrayOfNumbers);

        // loop over all columns and do the same thing, summing them together. return the sum
        int sumAllColumns = sumColumns(arrayOfNumbers);
        return -1;
    }

    private String[][] construct2dArray(List<String> content, int sizeOfRows)
    {
        String [][] array = new String[content.size()][sizeOfRows];

        // in each content the items are separated by a space. loop ith times where i is the amount of items in a string
        for(String row : content){

            String [] items = row.split(" ");
            int j = 0;

            for(String element: items){
                if(!element.isEmpty()){
                int i = content.indexOf(row);
                array[i][j] = element;
                j++;
            }}
        }
        return array;
    }

    private int calculateSumOfOneColumn(String[][] arrayOfNumbers)
    {

        return -1;
    }

    private int sumColumns(String[][] arrayOfNumbers)
    {

        return 0;
    }

    private List<Character> getArithmeticOperators(String row){
        char [] r = row.toCharArray();
        List <Character>operators = new ArrayList<>();
        for(char el : r ){
            if(el == '+' || el == '-' || el == '*' || el == '/'){
                operators.add(el);
            }
        }
        return operators;
    }

}
