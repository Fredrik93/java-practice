package org.example.leetcode.medium;

public class DeciNumbers {
    public int minPartitions(String n) {
        // figure out the highest number that can be used eg for 32 it is 11, next is 100 which is larger than 32
        int numberOfOperations = 0;
        int number = 0;
        while (number >= 0) {
            number -= calculateHighestIntegerThatCanBeDeducedFromTotal(n);
            numberOfOperations++;
            System.out.println("number: " + number);

            // deduce that from sum
            //  count operations
        }


        return numberOfOperations;
    }

    private int calculateHighestIntegerThatCanBeDeducedFromTotal(String n) {
        int numberOfDigits = n.length();
        StringBuilder sb = new StringBuilder();
        // highest number is all 1s for the size of the number eg 82 would mean biggest is 11, 11 < 82 < 100
        for (int i = 0; i < n.length(); i++) {
            sb.append(1);
        }
        // if it is too large then reduce the last 1 to a 0
        int i = 0;
        if (Integer.parseInt(sb.toString()) < Integer.parseInt(n)) {

            while(n.charAt(i)- '0' != 0){
            sb.deleteCharAt(n.length()-1);
            sb.append(1);
            i++;
        }
        }


        return 1;
    }


}
