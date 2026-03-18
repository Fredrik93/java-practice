package org.example.leetcode.easy;

public class RomanToNumConverter {
    public int romanToInt(String s) {
        // to char arr
        char[] arr = s.toCharArray();
        //  convert the char to number
        int currentSymbolSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            // if I then iterate until no longer an I and convert to number, eg IIV gives 1 (I) and then 4 (IV) or IIIV gives 2 (II) and 4 (IV)
            switch (currentChar) {
                case 'I':
                    currentSymbolSum++;
                    break;
                case 'V':
                    currentSymbolSum = 5;
                    break;
                case 'X':
                    currentSymbolSum = 10;
                    break;
            }

        }
        sum += currentSymbolSum;

        return sum;
    }
}
