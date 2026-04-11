package org.example.leetcode.medium;

public class DeciNumbers {
    public int minPartitions(String n) {
        // figure out the highest number that can be used eg for 32 it is 11, next is 100 which is larger than 32
        int numberOfOperations = 0;
        int number = 0;
        while(number >= 0) {
            number -= calculateHighestIntegerThatCanBeDeducedFromTotal(n);
            numberOfOperations++;
            System.out.println("number: " + number);

            // deduce that from sum
            //  count operations
        }


        return numberOfOperations;
    }
    private int calculateHighestIntegerThatCanBeDeducedFromTotal(String n){
        int numberOfDigits = n.length();


        return 1;
    }



}
