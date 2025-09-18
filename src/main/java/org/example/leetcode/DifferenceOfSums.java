package org.example.leetcode;

public class DifferenceOfSums
{
    public int differenceOfSums(int n, int m)
    {
        int divisible = 0;
        int nonDivisible =0;
        // iterate n times
        for(int i = 0; i <= n; i++)
        {
            // check each element, if el%m==0 then its divisible, else not
            if(i % m == 0){
                divisible += i;
            } else {
                nonDivisible += i;
            }
            // save to variable divisible & notDivisible based on if el&-..
            // calculate div - notDiv and return

        }
        return nonDivisible - divisible;

    }
}
