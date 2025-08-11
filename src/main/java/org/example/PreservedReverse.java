package org.example;

import java.util.Arrays;
import java.util.Stack;

public class PreservedReverse
{

    public String reverse(String input)
    {
        // split up in chars
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        char[] result = new char[arr.length];
        int j= 0;
        for(int i = 0; i < arr.length; i++)
        {
            // if we encounter a space, or if we reach the end of the array,
            // empty stack into results
            //stopped here. something wrong with last if
            if(arr[i] == ' ' || arr[i] == ',' || i == arr.length-1){

                while(!stack.isEmpty()){
                    result[j] = stack.pop();
                    j++;
                }
                // add the non-alfa char
                result[j] = arr[i];
                j++;

            } else {
            stack.push(arr[i]);

        }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : result){
            sb.append(c);
        }
        return sb.toString();
    }

}
