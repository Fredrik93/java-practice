package org.example;

import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s)
    {

        char arr [] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i] == ')' || arr[i] == ']' || arr[i] == '}'){
                stack.push(arr[i]);
            }
        }
        int i = 0;
        while(!stack.isEmpty()){
            char closingSymbol = stack.pop();
            if(arr[i] == '(' && closingSymbol == ')' || arr[i] == '[' && closingSymbol == ']' || arr[i] == '{' && closingSymbol == '}'){
                i++;
            } else {
                return false;
            }
        }
        if(stack.empty()){return true;}
        return false;
    }

}
