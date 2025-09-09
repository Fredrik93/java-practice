package org.example;

/**
 * You are given an integer array order of length n and an integer array friends.
 *
 * order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
 * friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
 * Return an array containing your friends' IDs in their finishing order.
 */

public class FinishingOrder
{
    public int[] recoverOrder(int[] order, int[] friends) {
        int [] result = new int[friends.length];
        int k = 0;
        // loop over order
        for(int i = 0; i<order.length; i++)
        {
            // inside, loop over friends for each i
            for(int j=0; j<friends.length; j++)
            {
                if(order[i] == friends[j]){
                    result[k] = friends[j];
                    k++;
                }
                // if exist, push to int [] result
                // return result
            }
        }
        return result;
    }
}
