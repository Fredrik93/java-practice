package org.example.leetcode.medium;

public class MinimumPartition {
    public int minPartitions(String n) {
        int number = Integer.parseInt(n);
        int operations = 0;
        // get the numOfDigits e.g., 32 is "2", 123 is "3"
        int numOfDigits = n.toCharArray().length;
        int currentDeciBinary = 0;
        while (number > 0) {

            currentDeciBinary = getCurrentDeciBinary(numOfDigits);
            // currentDeciBin: substract the deci bin num that is numOfDigits long eg 11 or 111
            if(number > currentDeciBinary){
                number -= currentDeciBinary;
                operations++;
            }
            else {
                // first try if the difference is just 1
                if(number >= currentDeciBinary-1){
                    number -= currentDeciBinary -1;
                    operations++;
                }
                // recalculate what currentDeciBin should be
                // start removing a smaller deci bin

            }
            // continue until num is 0
        }
        return operations;
    }
    private int getCurrentDeciBinary(int numOfDigits){
        String maxNum = "1111111111";
        String sub = maxNum.substring(0,numOfDigits);
        return Integer.parseInt(sub);
    }
}
