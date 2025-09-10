package org.example.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Amazon test question
 */
public class ReverseArrayQueries
{
    public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
        // Write your code here
        for(int i=0; i<operations.size(); i++){
            int start = operations.get(i).get(0);
            int end = operations.get(i).get(1)+1;
            Collections.reverse(arr.subList(start,end));
        }

        return arr;
    }
}
