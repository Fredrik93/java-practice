package org.example.leetcode;

import java.util.Stack;

public class ValidParentheses2
{
    public boolean isValid(String s)
    {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack <Character> stack = new Stack<>();
        for( char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            
            } else if (c == ')'){
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
                
            }
            else if (c == '}'){
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
                
            }
            else if (c == ']'){
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
                
            }
             
        }
        if(!stack.isEmpty()){
         return false;
        }
        return true;
    }
}
