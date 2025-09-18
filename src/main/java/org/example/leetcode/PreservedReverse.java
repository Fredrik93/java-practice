package org.example.leetcode;

import java.util.Stack;

public class PreservedReverse
{

    public String reverse(String input)
    {
        Stack<Character> stack = new Stack<>();
        char[] charArr = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c : charArr)
        {
            if(Character.isLetterOrDigit(c))
            {
                stack.push(c);
            }
            else if(c == ' ' || !Character.isLetterOrDigit(c))
            {
                while(!stack.isEmpty())
                {
                    result.append(stack.pop());
                }
                result.append(c);
            }

        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        return result.toString();
    }

}
