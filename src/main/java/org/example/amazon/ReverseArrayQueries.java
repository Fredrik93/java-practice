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
        int startIndex;
        int endIndex;
        for(int i = 0; i<operations.size(); i++)
        {
            List<Integer> sub;
            startIndex = operations.get(i).get(0);
            endIndex = operations.get(i).get(1)+1;

            sub = arr.subList(startIndex, endIndex);
            Collections.reverse(sub);
        }
    return arr;
    }
}
