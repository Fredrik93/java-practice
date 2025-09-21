package org.example.leetcode;

public class Palindrome
{
    /**
     * could be more efficient if i dont convert to string
     */
    public boolean isPalindromeUsingString(int x)
    {
        String o = String.valueOf(x);
        int left = 0;
        int right = o.length() - 1;
        while(left < right)
        {
            if(o.charAt(left) == o.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x)
    {
        // use module to remove the last digit of the int, which reverses the number e.g., 123 -> 321
        int[] reversedArr = calculateFirstDigit(x);
        // turn the arr into an int e.g., 3,2,1 -> 321
        int result = convertArrayToInt(reversedArr);
        // handle cases where integer is negative e.g., -121
        if(result < 0) { return false;}

        return result == x;
    }

    private static int[] calculateFirstDigit(int num)
    {
        // 20 is a random high number. could change it if needed to e.g., 245
        int arr[] = new int[20];
        int length = 0;

        int rest;
        /**
         * Calculate the first (leftmost)  digit
         * example:
         * while x > 10
         * i1
         * 134 % 10 = 4
         * 134 - 4 = 130
         * 130 / 10 = 13
         * i2
         * 13 % 10 = 3
         * 13 - 3  = 10
         * 10 / 10 = 1
         *
         */
        int i = 0;
        while(num >= 10)
        {
            rest = num % 10;
            num -= rest;
            arr[i] = rest;
            num = num / 10;
            i++;
            length ++;
        }
        arr[i] = num;
        length++;
        // create an arr with correct number of elements
        int res [] = new int[length];
        for(int j = 0; j<length; j++){
            res[j] = arr[j];
        }
        return res;
    }


    public int convertArrayToInt(int[] nums)
    {
        int tmp = 0;
        int index=0;
        // We need to start at the end of the loop and go backwards, e.g., the array 3,2,1 needs to multiply 3 (i == 0) with a multiplicator of 100 (i == nums.length-1)
        for(int i = nums.length-1; i>=0; i--){

            double multiplicatorOfTen = Math.pow(10, i);
            // Get the first element in the list
            double num = nums[index] * multiplicatorOfTen;
            tmp += num;
            index++;
        }

        return tmp;
    }
}
